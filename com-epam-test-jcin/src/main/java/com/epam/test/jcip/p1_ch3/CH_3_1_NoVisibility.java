package com.epam.test.jcip.p1_ch3;

/**
 * NoVisibility
 * <p/>
 * Sharing variables without synchronization
 * 
 * @author Brian Goetz and Tim Peierls
 */

public class CH_3_1_NoVisibility {
	private static boolean ready;
	private static int number;

	private static class ReaderThread extends Thread {
		public void run() {
			while (!ready)
				Thread.yield();
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		new ReaderThread().start();
		number = 42;
		ready = true;
	}
}
