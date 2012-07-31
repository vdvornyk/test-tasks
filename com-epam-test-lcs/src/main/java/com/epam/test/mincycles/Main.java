package com.epam.test.mincycles;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "6 1 3 6 1 3 6 1 3";

		Suffix[] sa = StringUtils.getSortSuffixSet(s);

		for (Suffix suffix : sa) {
			System.out.println(suffix.toString());
		}

		String res = StringUtils.getCyclesString(s);
		if (res != null) {
			System.out.println("result:" + res);
		} else {
			System.out.println("No cycles");
		}

	}

}
