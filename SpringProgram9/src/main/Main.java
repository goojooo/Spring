package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bean.Sudent;
import resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new  AnnotationConfigApplicationContext(SpringConfigFile.class);
		Sudent std =  ctx.getBean(Sudent.class);
		std.display();
	}

}
