package com.jin.allCnt;

import org.apache.hadoop.io.Text;

public class AirlineParser {
	private int year;
	private String month;
	private int cancelled;
	private int day;
	private int carrierDelay;
	private String uniqueCarrier;
	
	final int CANCELLED = 1;
	final int NONAIRFLIGHT = 0;
	final static int SUSPENSIONOFAIRLINE = -1;
	
	
	
	public String getUniqueCarrier() {
		return uniqueCarrier;
	}

	public int getCarrierDelay() {
		return carrierDelay;
	}

	public static int getSuspensionofairline() {
		return SUSPENSIONOFAIRLINE;
	}

	public AirlineParser() {
	}
	
	public AirlineParser(Text value) {
		String airData[] = value.toString().split(",");
		year = Integer.parseInt(airData[0]);
		month = airData[1];
		cancelled = Integer.parseInt(airData[21]);
		day = Integer.parseInt(airData[2]);
		uniqueCarrier = airData[8];
		
		if("NA".equalsIgnoreCase(airData[24])) {
			carrierDelay = SUSPENSIONOFAIRLINE;
		}else {
			carrierDelay = Integer.parseInt(airData[24]);
		}
	}
	
	
	
	public int getDay() {
		return day;
	}

	public int getCancelled() {
		return cancelled;
	}

	public int getYear() {
		return year;
	}
	public String getMonth() {
		return month;
	}
	
	
}
