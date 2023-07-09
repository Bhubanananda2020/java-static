package com.bhubanananda;

/**
 * The Class StaticVariable.
 *
 * @author Bhubanananda
 */
public class StaticVariable {

	/** The account no. */
	int accountNo;

	/** The user name. */
	String userName;

	/** The bank. */
	static String bank = "SBI";

	/**
	 * Instantiates a new static variable.
	 *
	 * @param accountNo the account no
	 * @param userName  the user name
	 */
	public StaticVariable(int accountNo, String userName) {
		this.accountNo = accountNo;
		this.userName = userName;
	}

	/**
	 * Display.
	 */
	private void display() {
		System.out.println(accountNo + "  " + userName + "  " + bank);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		new StaticVariable(101, "Bhubanananda").display();
	}
}
