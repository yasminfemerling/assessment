package com.assessment.backend.designPatterns;
/** 
 * This is the builder Pattern.
 * Here we have the abstract factory.
 * */
public interface AbstractFactory {
	Shape makeShape();
	Content makeContent();
}
