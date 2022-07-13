package com.yentar.creationalPatterns.singleton.lazy;

// Single Thread Version (non thread-safe)
public class LazySingleton {

	private static LazySingleton INSTANCE = null;
	private static int VALUE = 0;

	
	private LazySingleton() {

	}

	public static LazySingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LazySingleton();
		}
		return INSTANCE;
	}

	public void inkrementValue() {
		System.out.println(VALUE++);
	}

}
