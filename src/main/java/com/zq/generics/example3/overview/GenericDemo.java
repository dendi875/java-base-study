package com.zq.generics.example3.overview;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
	public void test() {
		List list = new ArrayList(); // 没有使用泛型，元素就是 Object 类型
		list.add("a");
		list.add("b");
		list.add(new StringBuilder("c"));

		for (Object obj : list) {
			String str = (String) obj; // 只有在运行期间才会出错
			System.out.println(str);
		}
	}
}
