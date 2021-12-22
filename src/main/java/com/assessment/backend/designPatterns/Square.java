package com.assessment.backend.designPatterns;
/** 
 * This is the builder Pattern.
 * Here we have the square.
 * */
public class Square implements Shape{

	private double side;
	
	@Override
	public double calculateArea() {
		return side*side;
	}

}
