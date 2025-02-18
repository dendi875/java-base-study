package com.zq.generics.example3.wildcard;

import java.util.List;

public class WildCardDemo {

	public static void printList(List<Object> list) {
		for (Object el : list) {
			System.out.println(el);
		}
	}
}
