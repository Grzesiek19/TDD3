package com.TDD.example;

public class Fibonacci {

	/**
	 * Gives a value of a Fibonacci sequence for given term.
	 * 
	 * @param term, the term for which will be calculated Fibonacci value.
	 *             
	 * @return suitable value for given term.
	 */

	public static int getFiboValue(int term) {
		if (term == 0)
			return 0;
		else if (term == 1)
			return 1;
		return 0;
	}
}
