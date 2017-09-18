package com.java8.interfaceFeatures;

public interface InterfaceDefault {

	default String method() {
		return "hello! this is a default method";
	}

}
