package SpringCorePractice.SpringCore;

import com.practice.Car;
import com.practice.Engine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        Engine e = new Engine();
        Car c = new Car(e);
        c.drive();
    }
    
}
