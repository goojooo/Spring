package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSeason {
    public static void main(String[] args) {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        SeasonFinder finder = ctx.getBean("seasonFinder", SeasonFinder.class);

        System.out.println("Current Season : " + finder.findSeason());
    }
}
