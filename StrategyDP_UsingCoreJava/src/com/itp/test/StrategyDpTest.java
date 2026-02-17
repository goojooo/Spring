package com.itp.test;

import com.itp.component.FlipKart;
import com.itp.factory.FlipKartFactory;

public class StrategyDpTest {

	  public static void main(String[] args) {
	  //get FlipKart class obj
	    FlipKart fpkt=FlipKartFactory.getInstance("dtdc");
	  //invoke business method
	    String msg=fpkt.shopping(new String[] {"shirt", "pant"},new double[] {2000.00,3000.00});  
	  
	  System.out.println(msg);
	  }

	}
