package com.assessment.backend.designPatterns;
public class Singleton {
	
	private static Singleton singleton;
	public String value;
	
	private Singleton(String value) {
	    this.value = value;
	}
	
	public static Singleton getInstance(String value) {
	    if (singleton == null) {
	        singleton = new Singleton(value);
	    }
	    return singleton;
	}
	
}
