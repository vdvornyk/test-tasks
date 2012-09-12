package com.epam.test.jcip.p2_ch6;

/**
 * UnsafeSequence
 * 
 * @author Brian Goetz and Tim Peierls
 */

public class UnsafeSequence {
	private int value;

	/**
	 * Returns a unique value.
	 */
	public int getNext() {
		return value++;
	}
}
