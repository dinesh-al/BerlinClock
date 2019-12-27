package com.ubs.opsit.interviews.impl;

import org.junit.Assert;
import org.junit.Test;

public class TimeHourTest{
	
	TimeHour timeHour = new TimeHour();
	
	@Test
	public void TestGetLightOnOff() {
		Assert.assertEquals("OOOO\r\nRRRO", timeHour.getLightOnOff(3));
		Assert.assertEquals("ROOO\r\nRROO", timeHour.getLightOnOff(7));
		Assert.assertEquals("RRRO\r\nOOOO", timeHour.getLightOnOff(15));
		Assert.assertEquals("RRRR\r\nOOOO", timeHour.getLightOnOff(20));	
		Assert.assertEquals("RRRR\r\nRROO", timeHour.getLightOnOff(22));	
    }
}
