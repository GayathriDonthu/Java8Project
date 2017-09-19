package com.java8.typeInference;

public class TypeInferenceDemo {
	
	public static void main(String[] args) {
		
		TypeInference<String> inf = new TypeInference<String>();
		System.out.println(inf.getDefaultValue("45", TypeInference.defaultValue())); // java 7 Value.< String >defaultValue()
		
	}
	
}
