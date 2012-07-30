package com.epam.test.happynumber;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	private static final String PATH_OPTION = "p";
	private static Options options;

	private static CommandLineParser parser = new PosixParser();

	static {
		options = new Options();
		OptionBuilder.withArgName("string");
		OptionBuilder.hasArg(true);
		OptionBuilder.withDescription("path to file with input info");
		OptionBuilder.isRequired(true);
		options.addOption(OptionBuilder.create(PATH_OPTION));
	}

	public static void main(String[] args) {
		try {
			List<String> inLines = readFile(args);
			checkLines(inLines);
		} catch (ParseException exp) {
			printCliHelp(exp.getMessage());
		} catch (IOException exp2) {
			// TODO Auto-generated catch block
			printCliHelp(exp2.getMessage());
		}
	}

	private static List<String> readFile(String[] args) throws ParseException, IOException {
		CommandLine cmd = parser.parse(options, args);

		logger.info("File Path={}", cmd.getOptionValue(PATH_OPTION));
		String filePath = cmd.getOptionValue(PATH_OPTION);

		return FileUtils.readLines(new File(filePath));

	}

	private static void checkLines(List<String> inLines) {
		for (String line : inLines) {
			try {
				logger.info("{}", HappyNumberUtils.isHappy(line));
			} catch (NumberFormatException nfe) {
				logger.error(nfe.getMessage());
			}
		}
	}

	private static void printCliHelp(String message) {
		logger.error(message);
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("java -jar com-epam-test-happynumber.jar", options);
		System.exit(-1);
	}

}
