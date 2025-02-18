package com.zq.generics.example2.wildcard;

import java.util.List;

import com.zq.generics.example2.bounded.Animal;


/**
 * 泛型通配符
 *
 * 在 Java 中使用 ? 来代表未知类型，它也可以用作泛型参数类型，它可以接受任何类型
 *
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since  2023-10-16 18:08:01
 */
public class WildPrinter {

	/**
	 * 泛型通配符
	 */
	public void print(List<?> list) {
		System.out.println(list);
	}

	/**
	 * 泛型通配符上限，? 这个未知类型必须是指定类型的子类型或者该类型。使用 extends 关键字
	 */
	public void printAnimals(List<? extends Animal> animals) {
		animals.forEach((animal) -> System.out.println(animal.getName()));
	}

	/**
	 * 泛型通配符下限，? 这个未知类型必须是指定类型的超类。使用 super 关键字，后面跟超类型
	 */
	public void addIntegers(List<? super Integer> list) {
		list.add(new Integer(70));
	}
}
