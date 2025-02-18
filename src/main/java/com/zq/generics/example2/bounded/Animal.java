package com.zq.generics.example2.bounded;

import java.util.Objects;

public class Animal {
	private final String name;
	private final String color;
	private final Integer age;

	public Animal(String name, String color, Integer age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Animal animal = (Animal) o;
		return Objects.equals(name, animal.name) &&
				Objects.equals(color, animal.color) &&
				Objects.equals(age, animal.age);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, color, age);
	}
}
