package com.practice;

public class Car {
	Engine engine;
	
	public Car(Engine engine)
	{
	this.engine = engine;	
	}
	public void drive()
	{
		System.out.println("Car is driving...!");
		engine.startEngine();
	}
	
	
}
