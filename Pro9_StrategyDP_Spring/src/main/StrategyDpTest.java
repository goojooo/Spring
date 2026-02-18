package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import appconfig.AppConfic;
import component.FlipKart;

public class StrategyDpTest {

	  public static void main(String[] args) {
	  //get FlipKart class obj
		  AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfic.class);
	    FlipKart fpkt=ctx.getBean("fpkt", FlipKart.class);
	  //invoke business method
	    String msg=fpkt.shopping(new String[] {"shirt", "pant"},new double[] {2000.00,3000.00});  
	  
	  System.out.println(msg);
	  }

	}
