package com.yentar.creationalPatterns.singleton.eager;

public class Client {
	
	public static void main(String args[]) {
		EagerSingleton1.INSTANCE.inkrementValue(); // Solution 1
		EagerSingleton2.getInstance().inkrementValue(); // Solution 2
	}
	
}
