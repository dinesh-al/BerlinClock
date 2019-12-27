package com.ubs.opsit.interviews.impl;

import com.ubs.opsit.interviews.util.Time;

public class TimeMinute implements Time {

    private static final String RED = "R";
    private static final String YELLOW = "Y";
    private static final String FOUR_LIGHTS_OFF = "OOOO";
    private static final String ELVN_LIGHTS_OFF = "OOOOOOOOOOO";

    private String getLightOnOffForMinuteFive(int m) {
        StringBuffer lmp = new StringBuffer(ELVN_LIGHTS_OFF);
        for (int i = 0; i < m; i++) {
            if (0 == (i + 1) % 3) {
                lmp.replace(i, i + 1, RED);
            } else {
                lmp.replace(i, i + 1, YELLOW);
            }
        }
        return lmp.toString();
    }

    private String getLightOnOffForMinuteSingle(int m) {
        StringBuffer lmp = new StringBuffer(FOUR_LIGHTS_OFF);
        for (int i = 0; i < m; i++) {
            lmp.replace(i, i + 1, YELLOW);
        }
        return lmp.toString();
    }

	@Override
	public String getLightOnOff(int number) {
        int minuteDivided = number / 5;
        int minuteModule = number % 5;
        return getLightOnOffForMinuteFive(minuteDivided) + "\r\n" + getLightOnOffForMinuteSingle(minuteModule);
    }
}
