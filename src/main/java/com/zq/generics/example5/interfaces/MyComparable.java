package com.zq.generics.example5.interfaces;

/**
 * 泛型接口和泛型类的声明是一样的
 *
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since  2024-03-13 11:32:32
 */
public interface MyComparable<T> {

	public int compareTo(T o);
}
