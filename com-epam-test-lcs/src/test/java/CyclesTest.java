import org.junit.Assert;
import org.junit.Test;

import com.epam.test.mincycles.CyclesUtils;

public class CyclesTest {
	@Test
	public void cyclesExists() {
		Assert.assertEquals("12", CyclesUtils.getCyclesString("12121212"));
		Assert.assertEquals("12", CyclesUtils.getCyclesString("12 12 12 12"));
		Assert.assertEquals("1 2", CyclesUtils.getCyclesString("1 2 1 2 1 2 1 2"));
		Assert.assertEquals("1 2 3", CyclesUtils.getCyclesString("893 329 32 1 2 3 1 2 3"));
		Assert.assertEquals("66 3 1", CyclesUtils.getCyclesString("2 0 6 3 1 66 3 1 66 3 1"));
		Assert.assertEquals("6 3 1", CyclesUtils.getCyclesString("2 0 6 3 1 6 3 1 6 3 1"));
		Assert.assertEquals("6 3 1", CyclesUtils.getCyclesString("2 0 6 3 1 6 3 1 6 3 1"));
		Assert.assertEquals("1 2 3", CyclesUtils.getCyclesString("1 2 3 1 2 3"));
		Assert.assertEquals("44", CyclesUtils.getCyclesString("4444444444"));
	}

	@Test
	public void cyclesNotExitst() {
		Assert.assertNull(CyclesUtils.getCyclesString("12 12 12 1 2"));
		Assert.assertNull(CyclesUtils.getCyclesString("4444444 4 4 4 3"));
		Assert.assertNull(CyclesUtils.getCyclesString("     "));
		Assert.assertNull(CyclesUtils.getCyclesString("1 2 3 4 5"));

	}
}
