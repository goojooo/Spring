package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.beans.Student;

public class Main {

	public static void main(String[] args) {
		String config_file_loc = "/in/resources/applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(config_file_loc);
		
		Student std = (Student) ctx.getBean("stdId");
		std.display();
	}

}
 