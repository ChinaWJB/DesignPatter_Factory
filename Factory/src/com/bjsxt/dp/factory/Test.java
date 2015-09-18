package com.bjsxt.dp.factory;

public class Test {
	public static void main(String[] args) {
		//Car c = Car.getInstance();
		//Car c2 = Car.getInstance();
		VehicleFactory factory = new BroomFactory();
		Moveable m = factory.createVehicle();
		//if(c == c2) System.out.println("same car");
		m.run();
	}
}
