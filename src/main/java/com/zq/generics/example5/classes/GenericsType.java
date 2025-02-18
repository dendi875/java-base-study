package com.zq.generics.example5.classes;

public class GenericsType<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		GenericsType<String> type = new GenericsType<>();
		type.set("hello");
		String str = type.get();
		System.out.println(str);

		GenericsType type1 = new GenericsType(); // 里面是 Object
		type1.set("hello");
		type1.set(10);

		Integer i = (Integer) type1.get();
		System.out.println(i);
	}
}
