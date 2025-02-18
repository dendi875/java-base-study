package com.zq.generics.example4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.zq.example4.bounded.upper.Developer;
import com.zq.example4.bounded.upper.Printer;
import com.zq.example4.methods.GenericMethodDemo;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("=======泛型方法==========");
		List<Integer> list1 = GenericMethodDemo.zipTogether(1, 2, 3);
		System.out.println(list1);

		List<String> stringList = GenericMethodDemo.zipTogether("a", "b", "c");
		System.out.println(stringList);

		System.out.println("=======泛型通配符上限==========");
		Printer.printInfo(Arrays.asList(
				new Developer(1, "张三", new ArrayList<>(Arrays.asList("Java", "Spring"))),
				new Developer(1, "张三", new ArrayList<>(Arrays.asList("Java", "PHP")))
		));

	}
}
