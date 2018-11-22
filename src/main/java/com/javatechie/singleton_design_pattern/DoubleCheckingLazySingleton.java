package com.javatechie.singleton_design_pattern;

public class DoubleCheckingLazySingleton {

	private DoubleCheckingLazySingleton() {
	}

	private static DoubleCheckingLazySingleton instance;

	public static DoubleCheckingLazySingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckingLazySingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckingLazySingleton();
				}
			}

		}
		return instance;
	}
}
