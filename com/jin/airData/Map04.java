package com.jin.airData;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Map04 extends Mapper<LongWritable, Text, Text, IntWritable> {

	// @Override는 오타가 있으면 오류가 나기 때문에 오타방지를 위해서라도 사용 하는게 좋다.
	@Override
	public void map(LongWritable key, Text value, Context output) throws IOException, InterruptedException {
		AirParser ap = new AirParser(value);

		if(ap.getWeatherDelay() > 0) {
			output.getCounter(Month.values()[ap.getMonth()-1]).increment(ap.getWeatherDelay());
		}
		output.write(new Text("weatherDelay All"), new IntWritable(ap.getWeatherDelay()));
		
		// int[] month = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		
		/*if (ap.getWeatherDelay() > 0) {
			for (int i = 0; i < month.length; i++) {
				if (i + 1 == ap.getMonth()) {
					output.write(new Text("WeatherDelay All"), new IntWritable(ap.getWeatherDelay()));
					output.getCounter(Month.values()[i]).increment(ap.getWeatherDelay());
				}
			}
		}*/

	}
}