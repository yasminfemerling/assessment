package com.assessment.backend.designPatterns;
/** 
 * This is the builder Pattern.
 * Here we have the concrete red circle factory.
 * */
public class RedCircleFactory implements AbstractFactory{

	@Override
	public Shape makeShape() {
		return new Circle();
	}

	@Override
	public Content makeContent() {
		return new Red();
	}

}
