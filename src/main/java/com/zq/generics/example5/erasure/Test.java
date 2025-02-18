package com.zq.generics.example5.erasure;

/**
 * java中的泛型是为了在编译时提供类型检查而在运行时没有用处的，
 * 因此Java编译器使用类型擦除功能来删除字节代码中的所有泛型类型检查代码，并在必要时插入类型转换。
 * 类型擦除确保不会为参数化类型创建新类；因此，泛型不会产生运行时开销。
 */
// 泛型类，T 是有上限限定的类型
public class Test <T extends Comparable<T>> {
	private T data;

	private Test<T> next;

	public Test(T data, Test<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}
}

/**
 *
 java编译器将有界类型参数T替换为第一个绑定接口Comparable

 public class Test {

	 private Comparable data;
	 private Test next;

	 public Node(Comparable d, Test n) {
	 this.data = d;
	 this.next = n;
	 }

	 public Comparable getData() { return data; }
 }
 */
