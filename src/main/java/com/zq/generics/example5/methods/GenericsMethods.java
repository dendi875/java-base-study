package com.zq.generics.example5.methods;


import com.zq.generics.example5.classes.GenericsType;

public class GenericsMethods {

	public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
		return g1.get().equals(g2.get());
	}

	public static void main(String[] args) {
		GenericsType<String> g1 = new GenericsType<>();
		g1.set("hello");
		GenericsType<String> g2 = new GenericsType<String>();
		g2.set("hello");

		boolean equal = GenericsMethods.<String>isEqual(g1, g2);
		// output: true
		System.out.println(equal);
	}
}
