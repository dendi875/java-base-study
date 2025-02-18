package com.zq.generics.example2.simple;

public class Printer<T> {
	private final T data;

	public Printer(T data) {
		this.data = data;
	}

	public void print() {
		System.out.println("print:::" + data);
	}
}
