package com.epam.test.mincycles;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "6 1 3 6 11111 3 6 11111 3";

		String res = CyclesUtils.getCyclesString(s);
		if (res != null) {
			System.out.println("result:" + res.trim());
		} else {
			System.out.println("No cycles");
		}
	}
}
