package com.java8.interfaceFeatures;

import java.util.function.Supplier;

public interface InterfaceStatic {

	static InterfaceDefault create(Supplier<InterfaceDefault> supplier) {
		return supplier.get();
	}

}
