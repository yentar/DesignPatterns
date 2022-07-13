package com.yentar.creationalPatterns.singleton.lazy;

public class SingleThreadClient{
	
	public static void main (String args []) {
		LazySingleton singleton = LazySingleton.getInstance();
		singleton.inkrementValue();
	}
}
