package com.zq.generics.example3;

import java.util.ArrayList;
import java.util.List;

import com.zq.generics.example3.wildcard.WildCardDemo;


public class MainClass {
	public static void main(String[] args) {
		System.out.println("=======泛型能帮助我们在编译期间进行类型检查====");
//		GenericDemo genericDemo = new GenericDemo();
//		genericDemo.test();

		System.out.println("=======无界泛型通配符====");

		List<Object> list = new ArrayList<>();
		list.add("abc");
		WildCardDemo.printList(list);
	}
}
