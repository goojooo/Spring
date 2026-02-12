package SpringCorePractice.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Engine e = new Engine();
//        Car c = new Car(e);
//        c.drive();
    	ApplicationContext context = new AnnotationConfigApplicationContext();

    	Car c = context.getBean(Car.class);

    }
    
}
