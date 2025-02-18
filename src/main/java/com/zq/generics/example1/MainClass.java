package com.zq.generics.example1;


import com.zq.generics.example1.classes.ArrayWrapper;
import com.zq.generics.example1.methods.MethodExample;

public class MainClass {

	public static void main(String[] args) {
		/*
		 ****************************************
		  泛型方法和常规方法示例
		 ****************************************
		*/
		System.out.println("=============泛型方法和常规方法示例=============");
		MethodExample methodExample = new MethodExample();

		methodExample.useRegularMethods();
		methodExample.useGenericMethods();

		/*
		 *****************************************
		 泛型类的使用示例
		 *****************************************
		 */
		System.out.println("=============泛型类的使用示例=============");
		Integer[] integerArray = new Integer[] {1, 2, 3};
		String[] stringArray = new String[] {"a", "b", "c"};
		// 泛型类的显示(Explicit way)使用
		ArrayWrapper<Integer> arrayWrapperIntegerEx = new ArrayWrapper<>(integerArray);
		arrayWrapperIntegerEx.print();

		ArrayWrapper<String> arrayWrapperStringEx = new ArrayWrapper<>(stringArray);
		arrayWrapperStringEx.print();

		// 泛型类型的隐式(Implicit way)使用
		ArrayWrapper arrayWrapperIntegerIm = new ArrayWrapper(integerArray);
		arrayWrapperIntegerIm.print();

		ArrayWrapper arrayWrapperStringIm = new ArrayWrapper(stringArray);
		arrayWrapperStringIm.print();

		ArrayWrapper arrayWrapperWhat = new ArrayWrapper<>();
		arrayWrapperWhat.setArray(integerArray);
		arrayWrapperWhat.print();

		// 泛型类中的泛型方法的使用
		arrayWrapperIntegerEx.print(stringArray);
		arrayWrapperStringEx.print(integerArray);
	}
}
