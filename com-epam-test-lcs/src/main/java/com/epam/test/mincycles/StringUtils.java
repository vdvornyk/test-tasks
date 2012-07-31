package com.epam.test.mincycles;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class StringUtils {
	public static Suffix[] getSortSuffixSet(final String str) {

		Set<Suffix> suffixSet = new TreeSet<Suffix>() {
			{
				for (int i = 0; i < str.length(); i++) {
					add(new Suffix(str.substring(i), i));
				}
			}
		};
		return suffixSet.toArray(new Suffix[str.length()]);
	}

	public static String getCyclesString(Suffix[] suffixArray, String str) {
		int len = str.length();
		for (int i = 2; i <= len / 2; i++) {
			String key = str.substring(len - i);
			int findIndex = Arrays.binarySearch(suffixArray, new Suffix(key));
			String doubleKey = key + key;
			System.out.println(str.substring(suffixArray[findIndex].getPosition() - key.length()));

			if (str.substring(suffixArray[findIndex].getPosition() - key.length()).equals(doubleKey)) {
				return key;
			}

			// if (suffixArray[findIndex + 1].getSuffix().equals(key + key)) {
			// return key;
			// }
		}
		return null;
	}

	public static String getCyclesString(String str) {
		int len = str.length();
		for (int i = 2; i <= len / 2; i++) {
			String key = str.substring(len - i);
			String doubleKey = key + key;
			if (str.substring(len - i - key.length()).equals(doubleKey)) {
				return key;
			}

			// if (suffixArray[findIndex + 1].getSuffix().equals(key + key)) {
			// return key;
			// }
		}
		return null;
	}
}
