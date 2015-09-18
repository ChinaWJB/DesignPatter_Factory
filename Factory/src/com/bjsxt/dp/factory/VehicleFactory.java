package com.bjsxt.dp.factory;

/**
 * 在交通工具抽象父类工厂中,只创建交通工具Vehicle
 * @author Administrator
 *
 */
public abstract class VehicleFactory {
	abstract Moveable createVehicle();
}
