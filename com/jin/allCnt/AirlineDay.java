package com.jin.allCnt;

import org.apache.hadoop.io.Text;

public class AirlineDay {
	private int day;

	public AirlineDay() {
	}
	
	public AirlineDay(Text value) {
		String airData[] = value.toString().split(",");
		day = Integer.parseInt(airData[3]);
	}
	
	public int getDay() {
		return day;
	}
	
}
