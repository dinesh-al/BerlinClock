package com.ubs.opsit.interviews.impl;

import org.junit.Assert;
import org.junit.Test;

public class TimeMinuteTest{
	
	TimeMinute timeMinute = new TimeMinute();
	
	@Test
	public void TestGetLightOnOff() {
		Assert.assertEquals("OOOOOOOOOOO\r\nYYYO", timeMinute.getLightOnOff(3));
		Assert.assertEquals("YOOOOOOOOOO\r\nYYOO", timeMinute.getLightOnOff(7));
		Assert.assertEquals("YYROOOOOOOO\r\nOOOO", timeMinute.getLightOnOff(15));
		Assert.assertEquals("YYRYOOOOOOO\r\nOOOO", timeMinute.getLightOnOff(20));	
		Assert.assertEquals("YYRYOOOOOOO\r\nYYOO", timeMinute.getLightOnOff(22));	
    }
}
