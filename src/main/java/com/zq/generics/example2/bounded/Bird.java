package com.zq.generics.example2.bounded;

import java.io.Serializable;

public class Bird extends Animal implements Serializable {
	public Bird(String name, String color, Integer age) {
		super(name, color, age);
	}
}
