package com.jin.air3;

import org.apache.hadoop.io.Text;

public class AirParser {

	private String year; // private int year;
	private int month;
	private int week;
	private int depTime;
	private int day;
	private int carrierDelay;
	private String UniqueCarrier;
	private String TailNum;
	private int arrDelay;
	private int depDelay;
	private int distance;
	private int WeatherDelay;
	private int actualElapsedTi;
	private int CRSElapsedTime;
	private int cancelled;

	final int NONCANCELLED = 0;

	final static int SUSPENSIONOFAIRLINE = -1;
	final static int NOTAIRFLIGHT = 0;

	public AirParser() {

	}

	private int getDigitFromStr(String str, int defaultDigit) {
		if ("NA".equals(str.toUpperCase()))
			return defaultDigit;
		return Integer.parseInt(str);
	}

	public AirParser(Text txt) {
		String[] airData = txt.toString().split(",");
		year = airData[0];
		month = Integer.parseInt(airData[1]);
		day = Integer.parseInt(airData[2]);
		week = Integer.parseInt(airData[3]);
		depTime = getDigitFromStr(airData[4], SUSPENSIONOFAIRLINE);

		UniqueCarrier = airData[8];
		TailNum = airData[10];
		actualElapsedTi = getDigitFromStr(airData[11], SUSPENSIONOFAIRLINE);
		CRSElapsedTime = getDigitFromStr(airData[12], SUSPENSIONOFAIRLINE);
		arrDelay = getDigitFromStr(airData[14], SUSPENSIONOFAIRLINE);
		depDelay = getDigitFromStr(airData[15], SUSPENSIONOFAIRLINE);
		distance = getDigitFromStr(airData[18], SUSPENSIONOFAIRLINE);
		carrierDelay = getDigitFromStr(airData[24], NOTAIRFLIGHT);
		WeatherDelay = getDigitFromStr(airData[25], NOTAIRFLIGHT);
		cancelled = Integer.parseInt(airData[21]);
	}

	public int getCancelled() {
		return cancelled;
	}
	
	public void setCancelled(int cancelled) {
		this.cancelled = cancelled;
	}
	public void setYear(String year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public void setDepTime(int depTime) {
		this.depTime = depTime;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setCarrierDelay(int carrierDelay) {
		this.carrierDelay = carrierDelay;
	}

	public void setUniqueCarrier(String uniqueCarrier) {
		UniqueCarrier = uniqueCarrier;
	}

	public void setTailNum(String tailNum) {
		TailNum = tailNum;
	}

	public void setArrDelay(int arrDelay) {
		this.arrDelay = arrDelay;
	}

	public void setDepDelay(int depDelay) {
		this.depDelay = depDelay;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public void setWeatherDelay(int weatherDelay) {
		WeatherDelay = weatherDelay;
	}

	public void setActualElapsedTi(int actualElapsedTi) {
		this.actualElapsedTi = actualElapsedTi;
	}

	public void setCRSElapsedTime(int cRSElapsedTime) {
		CRSElapsedTime = cRSElapsedTime;
	}

	public String getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getWeek() {
		return week;
	}

	public int getDepTime() {
		return depTime;
	}

	public int getDay() {
		return day;
	}

	public int getCarrierDelay() {
		return carrierDelay;
	}

	public String getUniqueCarrier() {
		return UniqueCarrier;
	}

	public String getTailNum() {
		return TailNum;
	}

	public int getArrDelay() {
		return arrDelay;
	}

	public int getDepDelay() {
		return depDelay;
	}

	public int getDistance() {
		return distance;
	}

	public int getWeatherDelay() {
		return WeatherDelay;
	}

	public int getActualElapsedTi() {
		return actualElapsedTi;
	}

	public int getCRSElapsedTime() {
		return CRSElapsedTime;
	}
}
