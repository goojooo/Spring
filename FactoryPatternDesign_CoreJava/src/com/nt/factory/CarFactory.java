package com.nt.factory;

import com.nt.component.ICar;
import com.nt.component.LuxuaryCar;
import com.nt.component.SUVCar;
import com.nt.component.StandardCar;

public class CarFactory { 
	  //created by x programmer ,uses by y programmer
	  

	  //static factory method having factory pattern logic
	  public static ICar getInstance(String type)
	  {
	    System.out.println("CarFactory.getInstance()");
	    ICar car=null;
	    if(type.equalsIgnoreCase("standard"))
	      car=new StandardCar();
	    else if(type.equalsIgnoreCase("luxury"))
	      car=new LuxuaryCar();
	    else if(type.equalsIgnoreCase("sport"))
	      car=new SUVCar();
	    else
	      throw new IllegalArgumentException("invalid car");
	    return car;
	      
	    
	  }
	}
