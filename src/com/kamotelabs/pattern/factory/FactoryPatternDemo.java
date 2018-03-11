package com.kamotelabs.pattern.factory;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		// Get an object of Circle and call its draw method.
		Shape shapeCircle = shapeFactory.getShape("CIRCLE");
		// Call draw() method of Circle
		shapeCircle.draw();
		
		// Get an object of Square and call its draw method.
		Shape shapeSquare = shapeFactory.getShape("SQUARE");
		// Call draw() method of Square
		shapeSquare.draw();
		
		// Get an object of Rectangle and call its draw method.
		Shape shapeRectangle = shapeFactory.getShape("RECTANGLE");
		// Call draw() method of Rectangle
		shapeRectangle.draw();
		
	}

}
