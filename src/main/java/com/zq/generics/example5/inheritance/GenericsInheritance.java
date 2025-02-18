package com.zq.generics.example5.inheritance;

/**
 * 泛型类型的继承关系
 *
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since  2024-03-13 11:33:03
 */
public class GenericsInheritance {

	public static void main(String[] args) {
		String str = "abc";
		Object obj = new Object();
		obj = str; // String 是 Object 的子类，所以有效

		MyClass<String> stringMyClass = new MyClass<>();
		MyClass<Object> objectMyClass = new MyClass<>();
		// objectMyClass = stringMyClass; // 错误，因为 MyClass<T> 父类是 Object

	}

	public static class MyClass<T> {

	}
}
