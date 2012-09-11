package com.epam.test.jcip.p1_ch3;

import net.jcip.annotations.NotThreadSafe;

/**
 * MutableInteger
 * <p/>
 * Non-thread-safe mutable integer holder
 * 
 * @author Brian Goetz and Tim Peierls
 */

@NotThreadSafe
public class CH_3_2_MutableInteger {
	private int value;

	public int get() {
		return value;
	}

	public void set(int value) {
		this.value = value;
	}
}
