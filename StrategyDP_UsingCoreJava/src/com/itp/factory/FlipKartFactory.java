package com.itp.factory;

import com.itp.component.BlurDart;
import com.itp.component.DTDC;
import com.itp.component.FlipKart;
import com.itp.component.ICourier;

public class FlipKartFactory {

	  //factory method
	  public static FlipKart getInstance(String courierName) {
	    ICourier courier=null;
	    if(courierName.equalsIgnoreCase("dtdc"))
	      courier=new DTDC();
	    else if(courierName.equalsIgnoreCase("bDart"))
	      courier=new BlurDart();
	    else
	      throw new IllegalArgumentException("invalid courier name");
	  //create target class object
	    FlipKart fpkt=new FlipKart();
	  fpkt.setCourier(courier);
	  return fpkt;//return flipkart target class obj injected with ur choice courier serverice
	  }
	}
