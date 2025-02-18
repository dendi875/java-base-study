package com.zq.generics.example1.methods;

/**
 * 泛型方法使用
 *
 * @author <a href="mailto:quanzhang875@gmail.com">quanzhang875</a>
 * @since  2023-10-16 16:41:46
 */
public class MethodExample {

	public void useRegularMethods() {
		int [] integerArray = new int[]{1, 2, 3, 4, 5};
		double[] doubleArray = new double[] {1.1, 2.1, 3.1, 4.1, 5.1};

		printArray(integerArray);
		printArray(doubleArray);
	}

	public void useGenericMethods() {
		Integer[] integerArray = new Integer[]{1, 2, 3, 4, 5};
		Double[] doubleArray = new Double[]{1.1, 2.1, 3.1, 4.1, 5.1};
		String[] stringArray = new String[]{"a", "b", "c", "d", "e"};

		// 单个泛型变量的显示使用
		this.<Integer>printAnyArray(integerArray);
		this.<Double>printAnyArray(doubleArray);
		this.<String>printAnyArray(stringArray);

		// 单个泛型变量的隐示使用
		printAnyArray(integerArray);
		printAnyArray(doubleArray);
		printAnyArray(stringArray);

		// 多个泛型变量的隐式使用
		this.<Integer, String>printTwoArrays(integerArray, stringArray);

		// 多个泛型变量的隐式使用
		this.printTwoArrays(integerArray, stringArray);
	}

	public void printArray(int[] array) {
		StringBuilder arrayPrintString = new StringBuilder("Array: ");
		if (array != null && array.length != 0) {
			for (Integer printObject : array) {
				arrayPrintString
						.append(printObject)
						.append("|");
			}
		} else {
			arrayPrintString.append("Empty Array");
		}
		System.out.println(arrayPrintString);
	}

	public void printArray(double[] array) {
		StringBuilder arrayPrintString = new StringBuilder("Array: ");
		if (array != null && array.length != 0) {
			for (Double printObject : array) {
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
	 * 泛型数组打印
	 *
	 * 泛型方法和普通方法类似，泛型方法有一个特殊位置来声明它将接收的变量类型。
	 * 声明位于返回类型之前。
	 */
	public <ArrayType> void printAnyArray(ArrayType[] array) {
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
	 * 与普通方法一样，泛型方法也可以接收多个变量类型
	 */
	public <ArrayTypeOne, ArrayTypeTwo> void printTwoArrays(ArrayTypeOne[] arrayOne, ArrayTypeTwo[] arrayTwo) {
		StringBuilder arrayPrintString = new StringBuilder("ArrayTypeOne | ArrayTypeTwo\n");
		for (int index = 0; index < arrayOne.length; index++) {
			arrayPrintString
					.append(arrayOne[index])
					.append("|")
					.append(arrayTwo[index])
					.append("\n");
		}
		System.out.println(arrayPrintString);
	}
}
