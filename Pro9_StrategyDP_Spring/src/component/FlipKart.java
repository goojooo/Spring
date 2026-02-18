package component;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class FlipKart {
	  //has a property
	@Autowired
	@Qualifier("bDart")
	  private ICourier courier; 
	  
	  //setter method for assigning dependent class obj to target class obj
	  public void setCourier(ICourier courier) {
	    System.out.println("FlipKart.setCourier()");
	    this.courier=courier;
	  }
	  //b.method
	  public String shopping(String[] items,double []prices) {
	    //calculate bill amount
	    double billamt=0.0;
	    for(double p:prices)
	    billamt=billamt+p;
	    //generate the order id
	    Random rand=new Random();
	    int oid=rand.nextInt(10000); //generate random no between 0 to 9999
	    //use courier to deliver the product
	    String msg=courier.deliver(oid);
	    //generate final msg
	    return Arrays.toString(items)+"are purchase having prices:"+ Arrays.toString(prices)+"with bill amount"+ billamt+"..."+msg;
	  }

	}
