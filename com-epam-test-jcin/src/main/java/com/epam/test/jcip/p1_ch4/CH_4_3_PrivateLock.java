package com.epam.test.jcip.p1_ch4;

import net.jcip.annotations.GuardedBy;

/**
 * PrivateLock
 * <p/>
 * Guarding state with a private lock
 * 
 * @author Brian Goetz and Tim Peierls
 */
public class CH_4_3_PrivateLock {
	private final Object myLock = new Object();
	@GuardedBy("myLock")
	Widget widget;

	void someMethod() {
		synchronized (myLock) {
			// Access or modify the state of widget
		}
	}
}

class Widget {

}