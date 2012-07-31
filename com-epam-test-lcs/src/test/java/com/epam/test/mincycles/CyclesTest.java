package com.epam.test.mincycles;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CyclesTest {
	@Test
	public void cyclesExists() {
		Assert.assertEquals("12", CyclesUtils.getCyclesString("12 12 12 12"));
		Assert.assertEquals("1 2", CyclesUtils.getCyclesString("1 2 1 2 1 2 1 2"));
		Assert.assertEquals("1 2 3", CyclesUtils.getCyclesString("893 329 32 1 2 3 1 2 3"));
		Assert.assertEquals("66 3 1", CyclesUtils.getCyclesString("2 0 6 3 1 66 3 1 66 3 1"));
		Assert.assertEquals("6 3 1", CyclesUtils.getCyclesString("2 0 6 3 1 6 3 1 6 3 1"));
		Assert.assertEquals("6 3 1", CyclesUtils.getCyclesString("2 0 6 3 1 6 3 1 6 3 1"));
		Assert.assertEquals("1 2 3", CyclesUtils.getCyclesString("1 2 3 1 2 3"));
	}

	@Test
	public void cyclesNotExitst() {
		Assert.assertNull(CyclesUtils.getCyclesString("12 12 12 1 2"));
		Assert.assertNull(CyclesUtils.getCyclesString("4444444 4 4 4 3"));
		Assert.assertNull(CyclesUtils.getCyclesString("1 2 3 4 5"));
		Assert.assertNull(CyclesUtils.getCyclesString("1 2 31 2 3"));
	}

	@Test
	public void cyclesNullStr() {
		Assert.assertNull(CyclesUtils.getCyclesString("     "));
		Assert.assertNull(CyclesUtils.getCyclesString(""));
		Assert.assertNull(CyclesUtils.getCyclesString(null));
	}

	@Test
	public void cyclesWithotSpace() {
		Assert.assertNull(CyclesUtils.getCyclesString("12121212"));
		Assert.assertNull(CyclesUtils.getCyclesString("4444444444"));
	}

	@Test
	public void readEmptyFile() throws URISyntaxException, IOException {

		List<String> lines = Main.readLines(this.getClass().getResource("input1").toString().replace("file:", ""));
		Assert.assertNotNull(lines);
		Assert.assertEquals(0, lines.size());

	}

	@Test
	public void readSingleLine() throws URISyntaxException, IOException {

		List<String> lines = Main.readLines(this.getClass().getResource("input2").toString().replace("file:", ""));
		Assert.assertNotNull(lines);
		Assert.assertEquals(1, lines.size());

	}
}
