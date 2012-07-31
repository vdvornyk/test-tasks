package com.epam.test.happynumber;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class HappyNumberTest {
	@Test
	public void numberHappy() {
		Assert.assertEquals(1, HappyNumberUtils.isHappy("1"));
		Assert.assertEquals(1, HappyNumberUtils.isHappy("7"));
	}

	@Test
	public void numberUnhappy() {
		Assert.assertEquals(0, HappyNumberUtils.isHappy("22"));
		Assert.assertEquals(0, HappyNumberUtils.isHappy("999"));
	}

	@Test
	public void readMultipleLine() throws URISyntaxException, IOException {

		List<String> lines = Main.readLines(this.getClass().getResource("happy.txt").toString().replace("file:", ""));
		Assert.assertNotNull(lines);
		Assert.assertEquals(7, lines.size());

	}

	@Test
	public void readEmptyFile() throws URISyntaxException, IOException {

		List<String> lines = Main.readLines(this.getClass().getResource("happy1.txt").toString().replace("file:", ""));
		Assert.assertNotNull(lines);
		Assert.assertEquals(0, lines.size());

	}

	@Test
	public void readSingleLine() throws URISyntaxException, IOException {

		List<String> lines = Main.readLines(this.getClass().getResource("happy2.txt").toString().replace("file:", ""));
		Assert.assertNotNull(lines);
		Assert.assertEquals(1, lines.size());

	}

}
