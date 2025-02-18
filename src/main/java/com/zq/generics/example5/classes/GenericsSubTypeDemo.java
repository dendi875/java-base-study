package com.zq.generics.example5.classes;

import java.util.ArrayList;
import java.util.List;

public class GenericsSubTypeDemo {
	public static void main(String[] args) {
		List<? extends Integer> intList = new ArrayList<>();
		List<? extends Number> numList = new ArrayList<>();

		numList = intList; // List<? extends Integer> 是 List<? extends Number> 的子类型
	}
}

// List<String> 的子类型可以是 MyList<Sting, Integer> 或 MyList<String, Object> 等等
interface MyList<E, T> extends List<E> {

}


