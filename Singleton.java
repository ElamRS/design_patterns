package designPatterns;

/* source: https://refactoring.guru/design-patterns/singleton
 * 
 * A implementation of singleton must: 
 * 
 * - Make the default constructor private, 
 * 	 to prevent other objects from using 
 * 	 the new operator with the Singleton class.
 * 
 * - Create a static creation method that acts
 *   as a constructor. Under the hood, this method
 *   calls the private constructor to create an
 *   object and saves it in a static field.
 *   All following calls to this method return
 *   the cached object.
 * 
 */

public class Singleton {
	// Defines an instance of Singleton, in order to check if it's already been used
	private static Singleton instance;
	
	// Change the constructor to private
	private Singleton() {
		// TODO
	}
	
	// Pseudo-constructor method to call the real construtor
	// Obs: note that the method has a return type of 'Singleton'
	public static Singleton doSingleton() {
		// If statement to check if the instance hasn't been runned yet
		if (instance == null) {
			instance = new Singleton(); // The object 'instance' gets a new instance of 'Singleton'
		}
		// The method then return the instance created
		return instance;
	}
}
