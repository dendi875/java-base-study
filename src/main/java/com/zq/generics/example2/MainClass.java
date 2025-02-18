package com.zq.generics.example2;

import java.util.Arrays;

import com.zq.generics.example2.bounded.AnimalPrinter;
import com.zq.generics.example2.bounded.AnimalPrinter2;
import com.zq.generics.example2.bounded.Bird;
import com.zq.generics.example2.bounded.Cat;
import com.zq.generics.example2.bounded.Dog;
import com.zq.generics.example2.simple.MultiPrinter;
import com.zq.generics.example2.simple.NumberPrinter;
import com.zq.generics.example2.simple.Printer;
import com.zq.generics.example2.simple.TextPrinter;
import com.zq.generics.example2.wildcard.WildPrinter;


public class MainClass {

	public static void main(String[] args) {
		System.out.println("=============常规方式使用=============");
		NumberPrinter numberPrinter = new NumberPrinter(5);
		numberPrinter.print(); // output = print::: 5
		TextPrinter textPrinter = new TextPrinter("Hello");
		textPrinter.print();   // output = print::: Hello

		System.out.println("=============泛型使用=============");
		Printer<Integer> integerPrinter = new Printer<Integer>(5);
		integerPrinter.print();
		Printer<String> stringPrinter = new Printer<>("hi");
		stringPrinter.print();
		Printer<Double> doublePrinter = new Printer<>(3.14);
		doublePrinter.print();

		System.out.println("======接收多个参数的泛型类=====");
		MultiPrinter<String, Integer> multiPrinter = new MultiPrinter<String, Integer>("hi", 5);
		multiPrinter.print();

		System.out.println("======泛型上限========");
		AnimalPrinter<Cat> catAnimalPrinter = new AnimalPrinter<>(new Cat("小白", "白色", 1));
		catAnimalPrinter.print();
		AnimalPrinter<Dog> dogAnimalPrinter = new AnimalPrinter<>(new Dog("旺财", "黑色", 3));
		dogAnimalPrinter.print();

		System.out.println("==========多个泛型上限=========");
		AnimalPrinter2<Bird> printer2 = new AnimalPrinter2<>(new Bird("鹦鹉", "红色", 3));
		printer2.print();


		System.out.println("===========泛型通配符===========");
		WildPrinter wildPrinter = new WildPrinter();
		wildPrinter.print(Arrays.asList(1, 2));
		wildPrinter.print(Arrays.asList("hello", "world"));
		wildPrinter.print(Arrays.asList(
				new Cat("小白", "白色", 1),
				new Dog("旺财", "黑色", 3)
		));

		System.out.println("===========泛型通配符上限===========");
		wildPrinter.printAnimals(Arrays.asList(
				new Cat("小白", "白色", 1),
				new Dog("旺财", "黑色", 3)
		));


	}
}
