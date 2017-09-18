package com.java8;

import java.util.Arrays;

public class Lambda {

	public static void main(String[] args) {

		// printing list

		Arrays.asList("a", "b", "c").forEach(e -> System.out.println(e));

		Arrays.asList(1, 2, 3).forEach((Integer e) -> System.out.println(e));

		Arrays.asList("a", "b", "c").forEach(e -> {
			System.out.println(e);
			System.out.println(e);
		});

		// using local variables (making them final by default)

		String separator = ","; // equivalent to final String separator1 = ",";
		Arrays.asList("a", "b", "c").forEach((String e) -> System.out.println(e + separator));

		System.out.println("comparing");
		// comparing returns nothing

		Arrays.asList("a", "b", "c").sort((e1, e2) -> e1.compareTo(e2));

		// comparing returning results

		Arrays.asList("a", "b", "d").sort((e1, e2) -> {
			int result = e1.compareTo(e2);
			System.out.println("result:" + result);
			return result;
		});

	}

}
