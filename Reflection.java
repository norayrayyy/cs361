/**
 * 
 */
package reflection;

/**
 * @author Raisa Begum
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		Class<?> classes = o.getClass();
		StringBuilder inheritance = new StringBuilder("Inheritance order: ");

		while (classes != null) {
			inheritance.append(classes.getName());
			classes = classes.getSuperclass();
			if (classes != null) {
				inheritance.append(" inherits from ");
			}
		}
		System.out.println(inheritance.toString());
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] methods = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		System.out.println("\nList of Methods: ");
		for (Method method: methods) {
			System.out.println(method);
		}
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an objet of type String
		// TODO To complete
		String str = ("Reflection");
		System.out.println("Demonstatring methods");
		r.correspondingClass((str));
		r.inheritanceChain(str);
		r.listMethods(str);
		
		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO To complete		
		ColoredCircles coloredCircle = new ColoredCircles("Green");
		System.out.println("Demonstatring methods");
		r.correspondingClass((coloredCircle));
		r.inheritanceChain(coloredCircle);
		r.listMethods(coloredCircle);
	}
}




