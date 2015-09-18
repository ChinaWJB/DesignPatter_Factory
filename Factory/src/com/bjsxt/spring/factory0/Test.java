package com.bjsxt.spring.factory0;

import java.io.IOException;
import java.util.Properties;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		Properties props = new Properties();
		props.load(Test.class.getClassLoader().getResourceAsStream(
				"com/bjsxt/spring/factory0/spring.properties"));
		String vehicleTypeName = props.getProperty("VihicleType");
		System.out.println(vehicleTypeName);
		Object o = Class.forName(vehicleTypeName).newInstance();
		Moveable m = (Moveable)o;
		m.run();
	}

}
