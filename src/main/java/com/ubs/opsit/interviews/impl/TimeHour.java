package com.ubs.opsit.interviews.impl;

import com.ubs.opsit.interviews.util.Time;

public class TimeHour implements Time {

    private static final String LIGHTS_OFF = "OOOO";
    private static final String RED = "R";
    private static final int MULTIPLE_OF_FIVE = 5;

    public String getLightOnOffForMultipleOfFiveHours(int h) {
        StringBuffer lamps = new StringBuffer(LIGHTS_OFF);
        for (int i = 0; i < (h / MULTIPLE_OF_FIVE); i++) {
            lamps.replace(i, i + 1, RED);
        }
        return lamps.toString();
    }

    public String getLightOnOffForSingleHours(int h) {
        StringBuffer lmp = new StringBuffer(LIGHTS_OFF);
        for (int i = 0; i < (h % MULTIPLE_OF_FIVE); i++) {
            lmp.replace(i, i + 1, RED);
        }
        return lmp.toString();
    }

	@Override
	public String getLightOnOff(int number) {
		 return getLightOnOffForMultipleOfFiveHours(number) + "\r\n" + getLightOnOffForSingleHours(number);
	}
}

