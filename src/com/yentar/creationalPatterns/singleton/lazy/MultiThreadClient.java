package com.yentar.creationalPatterns.singleton.lazy;

public class MultiThreadClient extends Thread{
	
	public static void main (String args []) {
	
		new MultiThreadClient().start();
		new MultiThreadClient().start();
		
	}
	
	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			LazySingleton singleton = LazySingleton.getInstance();
			singleton.inkrementValue();
		}
	}
}
