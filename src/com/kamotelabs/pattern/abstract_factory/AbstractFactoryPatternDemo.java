package com.kamotelabs.pattern.abstract_factory;

public class AbstractFactoryPatternDemo {
	
	public static void main(String[] args) {
		
		// Get Shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
	
		// Get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		
		// Call draw method of Shape Circle
		shape1.draw();
		
		// Get an object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
				
		// Call draw method of Shape Rectangle
		shape2.draw();
		
		// Get an object of Shape Square
		Shape shape3 = shapeFactory.getShape("SQUARE");
						
		// Call draw method of Shape Square
		shape3.draw();
		
		// Get Color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		// Get an object of Color Red
		Color color1 = colorFactory.getColor("RED");
		
		// Call fill method of Red
		color1.fill();
		
		// Get an object of Color Green
		Color color2 = colorFactory.getColor("GREEN");
				
		// Call fill method of Red
		color2.fill();
		
		// Get an object of Color Blue
		Color color3 = colorFactory.getColor("BLUE");
						
		// Call fill method of Red
		color3.fill();
		
		
	}

}
