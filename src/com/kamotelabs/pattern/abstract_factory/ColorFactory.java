package com.kamotelabs.pattern.abstract_factory;

public class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	Color getColor(String color) {
		
		if(color == null) {
			return null;
		}
		
		if(color.equalsIgnoreCase("RED")) {
			return new Red();
		
		} else if(color.equalsIgnoreCase("GREEN")) {
			return new Green();
		
		} else if(color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		
		return null;
	}

}
