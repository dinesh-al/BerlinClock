package com.ubs.opsit.interviews.impl;

import com.ubs.opsit.interviews.util.Time;

public class TimeSecond implements Time {
	
	@Override
	public String getLightOnOff(int number) {
        if (0 == number % 2) {
            return "Y";
        }
        return "O";
    }
}
