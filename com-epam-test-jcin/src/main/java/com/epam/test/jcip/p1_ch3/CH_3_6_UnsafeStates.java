package com.epam.test.jcip.p1_ch3;

/**
 * UnsafeStates
 * <p/>
 * Allowing internal mutable state to escape
 * 
 * @author Brian Goetz and Tim Peierls
 */
class CH_3_6_UnsafeStates {
	private String[] states = new String[] { "AK", "AL" /* ... */
	};

	public String[] getStates() {
		return states;
	}
}
