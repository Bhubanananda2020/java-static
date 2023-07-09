package com.bhubanananda;

/**
 * The Class StaticNestedClass.
 *
 * @author Bhubanananda
 */
public class StaticNestedClass {

	/** The data. */
	static int data = 30;

	/**
	 * The Class Inner.
	 */
	static class Inner {

		/**
		 * display.
		 */
		void display() {
			System.out.println("data is " + data);
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		StaticNestedClass.Inner innerClass = new StaticNestedClass.Inner();
		innerClass.display();
	}
}
