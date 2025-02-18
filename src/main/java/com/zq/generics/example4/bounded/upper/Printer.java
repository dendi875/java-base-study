package com.zq.generics.example4.bounded.upper;

import java.util.List;

public class Printer {

	/**
	 * 泛型通配符上限
	 */
	public static void printInfo(List<? extends Employee> list) {
		for (Employee e : list) {
			System.out.println(e.toString());
		}
	}
}
