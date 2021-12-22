package com.assessment.backend.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import com.assessment.backend.designPatterns.Circle;
import com.assessment.backend.designPatterns.RedCircleFactory;

public class SingletonTest {
	@Test
	@DisplayName("Check that RedCircle factory does return a circle shape.")
	void redCircleFactoryReturnCircleShape()  {
		RedCircleFactory factory = new RedCircleFactory();
		assertThat(factory.makeShape() instanceof Circle);
		
	}
	
	
}
