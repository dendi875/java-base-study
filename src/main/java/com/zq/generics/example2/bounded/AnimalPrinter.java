package com.zq.generics.example2.bounded;

/**
 * 泛型上限
 *
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since  2024-03-13 11:02:54
 */
public class AnimalPrinter<T extends Animal> {
	private final T animalData;

	public AnimalPrinter(T animalData) {
		this.animalData = animalData;
	}

	public void print() {
		System.out.println("Name:::" + animalData.getName());
		System.out.println("Color:::" + animalData.getColor());
		System.out.println("Age:::" + animalData.getAge());
	}
}
