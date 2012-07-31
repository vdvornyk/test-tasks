package com.epam.test.mincycles;

public class CyclesUtils {
	public static String getCyclesString(String str) {
		if (str == null) {
			return null;
		}

		str = str.trim();
		if (str.equals("")) {
			return null;
		}
		str = " " + str;

		int len = str.length();
		for (int i = 2; i <= len / 2; i++) {
			String key = str.substring(len - i);
			String doubleKey = key + key;
			int k = 0;
			while (str.charAt((len - i - key.length() - k)) != ' ') {
				++k;
			}

			if (str.substring(len - i - key.length() - k).equals(doubleKey)) {
				return key.trim();
			}
		}
		return null;
	}
}
