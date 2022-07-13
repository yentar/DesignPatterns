package com.yentar.creationalPatterns.builder;


public class BuilderClient {

	public static void main (String args []) {
		Person person =  new Person.PersonBuilder().setVorname("Mehmet").setNachname("Yentar").setAlter(99).setBeruf("Informatiker").build();
		System.out.println(person);
	}
}
