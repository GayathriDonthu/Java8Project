package com.java8.interfaceFeatures;

public class InterfaceDemo {

	public static void main(String[] args) {

		InterfaceDefault idefault = InterfaceStatic.create(ImplementingClass1::new);
		System.out.println(idefault.method());

		idefault = InterfaceStatic.create(ImplementingClass2::new);
		System.out.println(idefault.method());

	}

}
