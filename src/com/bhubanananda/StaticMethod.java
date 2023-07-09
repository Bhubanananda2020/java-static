package com.bhubanananda;

/**
 * The Class StaticMethod.
 *
 * @author Bhubanananda
 */
public class StaticMethod {
	/** The account no. */
	int accountNo;

	/** The user name. */
	String userName;

	/** The bank. */
	static String bank = "SBI";

	/**
	 * Static display.
	 */
	static void staticDisplay() {
		System.out.println(bank);
	}

	/**
	 * Non static display.
	 */
	void nonStaticDisplay() {
		System.out.println(bank);
		System.out.println(userName);
	}

	/**
	 * Final display.
	 */
	void finalDisplay() {
		staticDisplay();
		nonStaticDisplay();
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		staticDisplay();
		new StaticMethod().nonStaticDisplay();
		new StaticMethod().finalDisplay();
	}
}
