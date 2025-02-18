package com.zq.generics.example5.erasure;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型擦除
 *
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since  2024-03-13 11:34:14
 */
public class GenericsErasureDemo {
	public static void main(String[] args) {
		Collection<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		// list.add(1); // 编译错误

		// 泛型擦写
		Collection temp = list;
		temp.add(1); // 编译正常

		System.out.println(temp);
	}
}
