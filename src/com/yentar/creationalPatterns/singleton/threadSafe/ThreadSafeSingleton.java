package com.yentar.creationalPatterns.singleton.threadSafe;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance = null;
	private static int VALUE = 0;

	private ThreadSafeSingleton() {

	}

	public synchronized static ThreadSafeSingleton getInstance() {
			if (instance == null) {
				instance = new ThreadSafeSingleton();
			}
		return instance;
	}

	public void inkementValue() {
		System.out.println(VALUE++);
	}
}
