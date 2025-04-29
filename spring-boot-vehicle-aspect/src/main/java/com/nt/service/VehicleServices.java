package com.nt.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.speakers.Song;
import com.nt.speakers.Speaker;
import com.nt.tyres.Tyre;

@Component
public class VehicleServices {
private Logger logger=Logger.getLogger(VehicleServices.class.getName());
@Autowired
private Speaker speakers;
private Tyre tyres;
public String playMusic(boolean vehicleStarted, Song song){

String music = null;
if(vehicleStarted){
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
music = speakers.makeSound(song);
}else{
logger.log(Level.SEVERE,"Vehicle not started to perform the" +
" operation");
}

return music;
}
public String moveVehicle(boolean vehicleStarted){
String status = null;
if(vehicleStarted){
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
status = tyres.rotate();
}else{
logger.log(Level.SEVERE,"Vehicle not started to perform the" +
" operation");
}
return status;
}
public String applyBrake(boolean vehicleStarted){
String status = null;
if(vehicleStarted){
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
status = tyres.stop();
}else{
logger.log(Level.SEVERE,"Vehicle not started to perform the" +
" operation");
}

return status;
}
public Speaker getSpeakers() {
return speakers;
}
public void setSpeakers(Speaker speakers) {
this.speakers = speakers;
}
public Tyre getTyres() {
return tyres;
}
@Autowired
public void setTyres(Tyre tyres) {
this.tyres = tyres;
}
}
 