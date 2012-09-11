package com.epam.test.jcip.p1_ch3;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * SynchronizedInteger
 * <p/>
 * Thread-safe mutable integer holder
 * 
 * @author Brian Goetz and Tim Peierls
 */
@ThreadSafe
public class CH_3_3_SynchronizedInteger {
	@GuardedBy("this")
	private int value;

	public synchronized int get() {
		return value;
	}

	public synchronized void set(int value) {
		this.value = value;
	}
}
