package com.bjsxt.dp.factory;

/**
 * 在每一个交通工具的子类工厂中，定义创建相应的交通工具的方法
 * @author Administrator
 *
 */
public class BroomFactory extends VehicleFactory{
	public Moveable createVehicle() {
		return new Broom();
	}
}
