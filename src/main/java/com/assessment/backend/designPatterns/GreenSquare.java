package com.assessment.backend.designPatterns;
/** 
 * This is the builder Pattern.
 * Here we have the concrete green square factory.
 * */
public class GreenSquare implements AbstractFactory{

	@Override
	public Shape makeShape() {
		return new Square();
	}

	@Override
	public Content makeContent() {
		return new Green();
	}

}
