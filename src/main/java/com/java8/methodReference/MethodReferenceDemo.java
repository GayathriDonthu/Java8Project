package com.java8.methodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

	public static void main(String[] args) {

		// method reference - constructor reference, Class::new

		final Car car = Car.create(Car::new);
		final List<Car> cars = Arrays.asList(car);

		// method reference - static method , Class::static_method
		cars.forEach(Car::collide);

		// method reference - instance method of current object,
		// Class::instance_method
		cars.forEach(Car::repair);

		// method reference - instance method of an isntance, instance::method
		cars.forEach(car::follow);

	}

}
