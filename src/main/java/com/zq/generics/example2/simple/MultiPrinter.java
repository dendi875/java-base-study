package com.zq.generics.example2.simple;

public class MultiPrinter<T, V> {
	private final T data1;
	private final V data2;

	public MultiPrinter(T data1, V data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	public void print() {
		System.out.println("print:::" + data1 + ":" + data2);
	}
}
