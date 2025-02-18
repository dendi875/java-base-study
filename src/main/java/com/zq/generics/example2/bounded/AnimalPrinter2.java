package com.zq.generics.example2.bounded;

import java.io.Serializable;

/**
 * 多个泛型上限示例
 *
 * 注意顺序：类应该放在最前面然后是 & ，接着是接口
 *
 * <T extends xxx & xxxInterface>
 *
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since  2023-10-16 17:58:29
 */
public class AnimalPrinter2<T extends Animal & Serializable> {
	private final T animalData;

	public AnimalPrinter2(T animalData) {
		this.animalData = animalData;
	}

	public void print() {
		System.out.println("Name:::" + animalData.getName());
		System.out.println("Color:::" + animalData.getColor());
		System.out.println("Age:::" + animalData.getAge());
	}
}
