package com.yentar.creationalPatterns.singleton.enumSingleton;

public enum EnumSingleton {

	INSTANCE; // guarantees that it is thread safe
	private static int VALUE = 0;

	public void inkrementValue() {
		System.out.println(VALUE++);
	}

}
