package com.java8;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		
		OptionalDemo.nullCheck();
		OptionalDemo.valueCheck();
		
	}
	
	public static void nullCheck() {
		Optional<String> fullName = Optional.ofNullable(null);
		System.out.println("fullName is set ?"+ fullName.isPresent());
		System.out.println("fullName:" + fullName.orElseGet(() -> "[none]"));
		
		System.out.println(fullName.map(s -> "Hey" + s + "!").orElse("Hey Stranger!"));
	}
	
	public static void valueCheck() {
		Optional<String> fullName = Optional.of("Gayathri");
		System.out.println("fullName is present ? " + fullName.isPresent());
		System.out.println("fullName : "+ fullName.orElseGet(() -> "[none]"));
		System.out.println(fullName.map( s -> "Hey " + s + "!").orElse("Hey Stranger"));
		
		
		
	}
	
}
