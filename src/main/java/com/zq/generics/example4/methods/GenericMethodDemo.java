package com.zq.generics.example4.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethodDemo {

	public static <E> List<E> zipTogether(E el1, E el2, E el3) {
		List<E> list = new ArrayList<>();
		list.addAll(Arrays.asList(el1, el2, el3));
		return list;
	}
}
