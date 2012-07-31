package com.epam.test.happynumber;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Main {

	public static void main(String[] args) throws IOException {
		List<String> lines = readLines((args[0]));
		for (String line : lines) {
			try {
				System.out.println(HappyNumberUtils.isHappy(line));
			} catch (NumberFormatException nfe) {

			}
		}
	}

	public static List<String> readLines(String path) throws IOException {
		return FileUtils.readLines(new File(path));
	}
}
