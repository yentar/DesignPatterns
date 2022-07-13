package com.yentar.creationalPatterns.builder;

public class Person {
	private String vorname;
	private String nachname;
	private int alter;
	private String beruf;
	
	private Person() {
	
	}

	private Person(PersonBuilder builder) {
		this.vorname = builder.vorname;
		this.nachname = builder.nachname;
		this.alter = builder.alter;
		this.beruf = builder.beruf;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public int getAlter() {
		return alter;
	}

	public String getBeruf() {
		return beruf;
	}

	@Override
	public String toString() {
		return "Person{" +
				"vorname='" + vorname + '\'' +
				", nachname='" + nachname + '\'' +
				", alter=" + alter +
				", beruf='" + beruf + '\'' +
				'}';
	}

	public static class PersonBuilder {
	private String vorname;
	private String nachname;
	private int alter;
	private String beruf;
	
	public PersonBuilder() {
		
	}
	
	PersonBuilder setVorname(String vorname) {
		this.vorname = vorname;
		return this;
	}
	
	PersonBuilder setNachname(String nachname) {
		this.nachname = nachname;
		return this;
	}
	
	PersonBuilder setAlter(int alter) {
		this.alter = alter;
		return this;
	}
	
	PersonBuilder setBeruf(String beruf) {
		this.beruf = beruf;
		return this;
	}
	
	public Person build() {
		return new Person(this);
	}
}}