package com.jin.airData;

import org.apache.hadoop.io.Text;

public class AirParser {

	private int arrDelay;
	private int depDelay;
	private int cancelled;
	private int carrierDelay;
	private String uniqueCarrier;
	private int distance;
	private int weatherDelay;
	private int month;
	private String tailNum;
	private int delayTime;

	final int CANCELLED = 1;
	final int NONAIRFLIGHT = 0;
	final static int SUSPENSIONOFAIRLINNE = -1;
	final static int NONDELAY = 0;

	private int getDigitFromStr(String str, int defaultDigit) {
		// 항공기 데이터 값에 NA가 있을 경우의 처리
		if ("NA".equalsIgnoreCase(str))
			return defaultDigit;
		else
			return Integer.parseInt(str);
	}

	public AirParser() {
	}

	public AirParser(Text value) {
		String[] airData = value.toString().split(",");
		arrDelay = getDigitFromStr(airData[14], NONDELAY);
		depDelay = getDigitFromStr(airData[15], NONDELAY);

		uniqueCarrier = airData[8];

		tailNum = airData[10];
		if (!airData[24].equalsIgnoreCase("NA")) {
			delayTime = Integer.parseInt(airData[24]);
		} else {
			delayTime = 0;
		}

		cancelled = Integer.parseInt(airData[21]);
		distance = Integer.parseInt(airData[18]);

		if ("NA".equals(airData[25])) {
		} else {
			weatherDelay = Integer.parseInt(airData[25]);
			month = Integer.parseInt(airData[1]);
		}

	}

	public int getDelayTime() {
		return delayTime;
	}

	public String getTailNum() {
		return tailNum;
	}

	public int getWeatherDelay() {
		return weatherDelay;
	}

	public int getMonth() {
		return month;
	}

	public int getDistance() {
		return distance;
	}

	public int getArrDelay() {
		return arrDelay;
	}

	public int getDepDelay() {
		return depDelay;
	}

	public int getCancelled() {
		return cancelled;
	}

	public int getCarrierDelay() {
		return carrierDelay;
	}

	public String getUniqueCarrier() {
		return uniqueCarrier;
	}

}