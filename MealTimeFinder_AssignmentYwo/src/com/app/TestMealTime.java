package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.app.MealTimeFinder;

public class TestMealTime {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MealTimeFinder finder = ctx.getBean("mealFinder", MealTimeFinder.class);

        System.out.println("Current Meal Time : " + finder.findMealTime());
    }
}
