package com.javatechie.singleton_design_pattern;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		LazzyInnerClassSingleton obj1 = LazzyInnerClassSingleton.getInstance();

		System.out.println(obj1.hashCode());

		LazzyInnerClassSingleton obj2 = LazzyInnerClassSingleton.getInstance();

		System.out.println(obj2.hashCode());
	}
}
