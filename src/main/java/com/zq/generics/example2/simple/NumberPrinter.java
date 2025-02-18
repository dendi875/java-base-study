package com.zq.generics.example2.simple;

public class NumberPrinter {

	private final Integer data;

	public NumberPrinter(Integer data) {
		this.data = data;
	}

	public void print() {
		System.out.println("print:::" + data);
	}
}
