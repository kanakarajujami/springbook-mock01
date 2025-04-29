package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.Vehicle;
import com.nt.service.VehicleServices;
import com.nt.speakers.Song;

@Component
public class VehicleServiceRunner implements CommandLineRunner {
	@Autowired
	 private Vehicle vehicle;
	@Autowired
	private VehicleServices vehicleService;
	@Override
	public void run(String... args) throws Exception {
		
		
		vehicle.printHello();
		System.out.println(vehicle.toString());
		
		Song song=new Song();
		song.setTitle("All Too Well");
		song.setSinger("Ed sheeran");
		
		String music=vehicleService.playMusic(true, song);
		System.out.println(music);
	    String status=	vehicleService.moveVehicle(true);
		
		String status2=vehicleService.applyBrake(true);
		System.out.println(status2);
	}

}
