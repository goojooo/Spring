package com.nt.test;

import com.nt.component.ICar;
import com.nt.factory.CarFactory;

public class Test {

	 public static void main(String[] args) {
		    // TODO Auto-generated method stub
		    //get obj from factory method
		    ICar car=CarFactory.getInstance("sport");
		    car.drive();
		    
		  }

}
