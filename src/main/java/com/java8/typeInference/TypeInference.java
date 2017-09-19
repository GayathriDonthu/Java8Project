package com.java8.typeInference;

public class TypeInference<T> {
	
	public static<T> T defaultValue() {
		return null;
	}
	
	public T getDefaultValue(T value, T defaultValue) {
		return (value != null) ? value : defaultValue;
	}
	
}
