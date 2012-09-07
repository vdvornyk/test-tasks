package com.epam.test.jcip.p1_ch2;

import net.jcip.annotations.NotThreadSafe;

/**
 * LazyInitRace
 * 
 * Race condition in lazy initialization
 * 
 * @author Brian Goetz and Tim Peierls
 */

@NotThreadSafe
public class LazyInitRace {
	private ExpensiveObject instance = null;

	public ExpensiveObject getInstance() {
		if (instance == null)
			instance = new ExpensiveObject();
		return instance;
	}
}

class ExpensiveObject {
}
