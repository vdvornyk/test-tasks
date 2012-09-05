package com.epam.test.jcip.p0;

import net.jcip.annotations.NotThreadSafe;

/**
 * UnsafeSequence
 * 
 * @author Brian Goetz and Tim Peierls
 */

@NotThreadSafe
public class UnsafeSequence {
	private int value;

	/**
	 * Returns a unique value.
	 */
	public int getNext() {
		return value++;
	}
}
