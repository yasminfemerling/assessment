package com.assessment.backend.designPatterns;
/** 
 * This is the builder Pattern.
 * Here we have the circle.
 * */
public class Circle implements Shape{

	private double radius;
	
	@Override
	public double calculateArea() {
		return radius * radius * (3.14);
	}

}
