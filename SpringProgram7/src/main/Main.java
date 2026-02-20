package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Student;
import resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std = ctx.getBean(Student.class);
		std.display();
	}
}
