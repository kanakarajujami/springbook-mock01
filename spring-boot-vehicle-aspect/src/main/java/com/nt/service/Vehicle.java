package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Vehicle { 
 
private String name="Audi"; 
 
private VehicleServices vehicleService; 

@Autowired 
public Vehicle(VehicleServices vehicleService) { 
 super(); 
 this.vehicleService = vehicleService; 
} 

public String getName() { 
 return name; 
} 

public void setName(String name) { 
 this.name = name; 
} 

 
 
@Override 
public String toString() { 
 return "Vehicle [name=" + name + "]"; 
} 

public void printHello(){ 
       System.out.println( 
   
   "Printing Hello from Component Vehicle Bean"); 
   }
}