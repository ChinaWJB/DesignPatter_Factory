package com.bjsxt.dp.factory;

public class PlaneFactory extends VehicleFactory{
	public Moveable createVehicle() {
		return new Plane();
	}
}
