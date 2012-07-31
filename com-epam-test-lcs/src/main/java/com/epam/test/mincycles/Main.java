package com.epam.test.mincycles;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		List<String> lines = FileUtils.readLines(new File(args[0]));
		for (String line : lines) {
			String res = CyclesUtils.getCyclesString(line);
			if (res != null) {
				System.out.println(res);
			}
		}
	}
}
