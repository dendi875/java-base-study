package com.zq.generics.example1.classes;

/**
 * 如果我们希望一个类拥有一个成员属性，这个成员属性是一个通用类型，该怎么做？
 * <p>
 * 正如和泛型方法一样，泛型类也有其变量类型的位置，它在声明在类名之后
 *
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since 2023-10-16 16:46:36
 */
public class ArrayWrapper<ArrayType> {

	private ArrayType[] array;

	public ArrayWrapper() {

	}

	/**
	 * @param array
	 */
	public ArrayWrapper(ArrayType[] array) {
		this.array = array;
	}

	/**
	 * @param array
	 */
	public void setArray(ArrayType[] array) {
		this.array = array;
	}

	/**
	 * 打印单个数组的泛型方法
	 */
	public void print() {
		StringBuilder arrayPrintString = new StringBuilder("Array: ");
		if (array != null && array.length != 0) {
			for (ArrayType printObject : array) {
				arrayPrintString
						.append(printObject)
						.append("|");
			}
		} else {
			arrayPrintString.append("Empty Array");
		}
		System.out.println(arrayPrintString);
	}

	/**
	 * 打印两个数组的泛型方法
	 */
	public <ArrayTypeTwo> void print(ArrayTypeTwo[] arrayTwo) {
		StringBuilder arrayPrintString = new StringBuilder("ArrayTypeOne | ArrayTypeTwo\n");
		for (int index = 0; index < array.length; index++) {
			arrayPrintString
					.append(array[index])
					.append("|")
					.append(arrayTwo[index])
					.append("\n");
		}
		System.out.println(arrayPrintString);
	}
}
