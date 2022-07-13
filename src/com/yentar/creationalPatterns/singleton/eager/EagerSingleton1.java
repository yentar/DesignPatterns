package com.yentar.creationalPatterns.singleton.eager;

//Single Thread Version (non thread-safe)
public class EagerSingleton1 {
	public static EagerSingleton1 INSTANCE = new EagerSingleton1();
	private static int VALUE = 0;
	
	private EagerSingleton1() {
		
	}
	
	public void inkrementValue() {
		System.out.println(VALUE++);
	}
}
