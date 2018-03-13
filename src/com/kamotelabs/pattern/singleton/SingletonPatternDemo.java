package com.kamotelabs.pattern.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		// Illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		
		// SingleObject object = new SingleObject();
		
		// Get the only object available
		SingleObject object = SingleObject.getInstance();
		
		// But can be called again
		SingleObject object1 = SingleObject.getInstance();
		
		// Show the message
		object.showMessage();
		
		// Show the message
		object1.showMessage();
	}
}
