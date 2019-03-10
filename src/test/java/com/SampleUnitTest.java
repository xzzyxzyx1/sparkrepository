package com;

import org.junit.Test;
import org.junit.Assert;
import com.HelloWorld;

public class SampleUnitTest {

	//abcd
	@Test
	public void sampleJunitTest() {
		Assert.assertEquals(3, HelloWorld.getSum(1,2));
	}

}