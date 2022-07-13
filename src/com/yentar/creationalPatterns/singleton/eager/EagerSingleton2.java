package com.yentar.creationalPatterns.singleton.eager;

//Single Thread Version (non thread-safe)
public class EagerSingleton2 {
	private static EagerSingleton2 INSTANCE = new EagerSingleton2();
	private static int VALUE = 0;

	private EagerSingleton2() {

	}

	public static EagerSingleton2 getInstance() {
		return INSTANCE;
	}

	public void inkrementValue() {
		System.out.println(VALUE++);
	}
}
