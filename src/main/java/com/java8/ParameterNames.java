package com.java8;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class ParameterNames {
	
	public static void main(String[] args) throws Exception {
		
		Method[] method = ParameterNames.class.getMethods();
		System.out.println(Arrays.toString(method));
		System.out.println("Method name:"+ method[1].getName());
		Parameter[] parameter =  method[1].getParameters();
		System.out.println("Parameter:"+ parameter[0].getName());
		
		Method method1 = ParameterNames.class.getMethod("greetings", String.class);
		for(final Parameter parameter1 : method1.getParameters()){
			if(parameter1.isNamePresent())
				System.out.println("Parameter1 : " + parameter1.getName());
			else
				System.out.println("Parameter name not present -- perform mvn clean and mvn install");
		}
		
		
	}
	
	public void greetings(String message){
		
		
		
	}
}
