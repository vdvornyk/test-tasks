package com.epam.test.jcip.p1_ch3;

/**
 * CountingSheep
 * <p/>
 * Counting sheep
 * 
 * @author Brian Goetz and Tim Peierls
 */
public class CH_3_4_CountingSheep {
	volatile boolean asleep;

	void tryToSleep() {
		while (!asleep)
			countSomeSheep();
	}

	void countSomeSheep() {
		// One, two, three...
	}
}
