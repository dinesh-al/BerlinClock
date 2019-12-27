package com.ubs.opsit.interviews.impl;

import org.junit.Assert;
import org.junit.Test;

public class BerlinClockTest{
	
	BerlinClock berlinClock = new BerlinClock();
	
	@Test
	public void TestGetLightOnOff() {
		Assert.assertEquals("Y\r\nOOOO\r\nOOOO\r\nOOOOOOOOOOO\r\nOOOO", berlinClock.convertTime("00:00:00"));
		Assert.assertEquals("Y\r\nRROO\r\nRRRR\r\nYYROOOOOOOO\r\nYYYY", berlinClock.convertTime("14:19:22"));
		Assert.assertEquals("O\r\nRRRR\r\nRRRO\r\nYYRYYRYYRYY\r\nYYYY", berlinClock.convertTime("23:59:59"));
		Assert.assertEquals("Y\r\nRRRR\r\nRRRR\r\nOOOOOOOOOOO\r\nOOOO", berlinClock.convertTime("24:00:00"));
			
    }
}
