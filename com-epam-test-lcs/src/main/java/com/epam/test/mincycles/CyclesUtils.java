package com.epam.test.mincycles;

public class CyclesUtils {
	public static String getCyclesString(String str) {
		int len = str.length();
		for (int i = 2; i <= len / 2; i++) {
			String key = str.substring(len - i);
			String doubleKey = key + key;
			if (str.substring(len - i - key.length()).equals(doubleKey)) {
				return key;
			}
		}
		return null;
	}
}
