package com.bjsxt.dp.factory;

import java.util.ArrayList;
import java.util.List;

public class Car implements Moveable{
	
	private static Car car = new Car();	//单例
	//private static List<Car> cars = new ArrayList<Car>();	//多例
	
	public Car(){}
	
	public static Car getInstance() {	//单例
		
		return car;
	}
	
	public void run() {
		System.out.println("冒着烟奔跑中car.......");
	}
}
