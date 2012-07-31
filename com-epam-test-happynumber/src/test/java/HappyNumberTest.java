import junit.framework.Assert;

import org.junit.Test;

import com.epam.test.happynumber.HappyNumberUtils;

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
}
