package com.zq.generics.example5.bounded;

import java.io.Serializable;

public class GenericsBoundedDemo {

	/**
	 * 泛型方法，泛型方法的上限限定 T 类型必须是 Comparable 类型或它的子类型，且实现了 Serializable 接口。
	 */
	public static <T extends Comparable & Serializable> int compare(T t1, T t2) {
		return t1.compareTo(t2);
	}
}
