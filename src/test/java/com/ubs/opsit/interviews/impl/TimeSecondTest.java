package com.ubs.opsit.interviews.impl;

import org.junit.Assert;
import org.junit.Test;

public class TimeSecondTest{
	
	TimeSecond timeSecond = new TimeSecond();
	
	@Test
	public void TestGetLightOnOff() {
		Assert.assertEquals("O", timeSecond.getLightOnOff(3));
		Assert.assertEquals("Y", timeSecond.getLightOnOff(2));
		Assert.assertEquals("O", timeSecond.getLightOnOff(1));
		Assert.assertEquals("Y", timeSecond.getLightOnOff(0));		
    }
}
