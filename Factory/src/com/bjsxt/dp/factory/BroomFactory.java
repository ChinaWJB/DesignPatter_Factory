package com.bjsxt.dp.factory;

/**
 * ��ÿһ����ͨ���ߵ����๤���У����崴����Ӧ�Ľ�ͨ���ߵķ���
 * @author Administrator
 *
 */
public class BroomFactory extends VehicleFactory{
	public Moveable createVehicle() {
		return new Broom();
	}
}
