package com.zq.generics.example5.classes;

public class GenericsTypeOld {
	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

	public static void main(String[] args) {
		GenericsTypeOld type = new GenericsTypeOld();
		type.set("hello");
		String str = (String) type.get();  // 必须使用类型转换
		System.out.println(str);
	}
}
