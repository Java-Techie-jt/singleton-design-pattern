package com.javatechie.singleton_design_pattern;

public class LazzyInnerClassSingleton {

	private LazzyInnerClassSingleton() {

	}

	private static class SingletonHelper {
		private static final LazzyInnerClassSingleton instance = new LazzyInnerClassSingleton();
	}

	public static LazzyInnerClassSingleton getInstance() {
		return SingletonHelper.instance;
	}

}
