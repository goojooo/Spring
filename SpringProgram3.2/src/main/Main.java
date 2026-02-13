package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;

public class Main {
	public static void main(String args[])
	{
		String rfs = "/resources/applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(rfs);
		Student std = (Student)ctx.getBean("student");
		std.display();
	}

}
