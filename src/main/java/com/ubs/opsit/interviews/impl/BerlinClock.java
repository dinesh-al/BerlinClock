package com.ubs.opsit.interviews.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.util.Time;

public class BerlinClock implements TimeConverter {
	
	private static final int INDEX_ZERO = 0;
	private static final int INDEX_ONE = 1;
	private static final int INDEX_TWO = 2;

	public String convertTime(String inputTime) {
		StringBuilder times = new StringBuilder();
		int[] splittedTimes = Stream.of(inputTime.split(":")).mapToInt(Integer::parseInt).toArray();

		List<Time> timePart = new ArrayList<Time>();
		timePart.add(new TimeHour());
		timePart.add(new TimeMinute());
		timePart.add(new TimeSecond());

		times.append(timePart.get(INDEX_TWO).getLightOnOff(splittedTimes[INDEX_TWO])).append("\r\n");
		times.append(timePart.get(INDEX_ZERO).getLightOnOff(splittedTimes[INDEX_ZERO])).append("\r\n");
		times.append(timePart.get(INDEX_ONE).getLightOnOff(splittedTimes[INDEX_ONE]));

		return times.toString();
	}

}
