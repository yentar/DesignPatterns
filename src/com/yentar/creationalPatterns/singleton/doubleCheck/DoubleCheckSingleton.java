package com.yentar.creationalPatterns.singleton.doubleCheck;

public class DoubleCheckSingleton {

	private static DoubleCheckSingleton INSTANCE = null;
	private static int VALUE = 0;
	
	private DoubleCheckSingleton() {
		
	}

	public static DoubleCheckSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (DoubleCheckSingleton.class) {
				INSTANCE = new DoubleCheckSingleton();
			}
		}
		return INSTANCE;
	}
	
	public void inkrementValue() {
		System.out.println(VALUE++);
	}

}
