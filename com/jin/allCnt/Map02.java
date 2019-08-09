package com.jin.allCnt;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class Map02 extends MapReduceBase 
implements Mapper<LongWritable, Text, IntWritable, IntWritable>{

	@Override
	public void map(LongWritable key, Text value, 
			OutputCollector<IntWritable, IntWritable> output, Reporter arg3) throws IOException {
		// 요일별 출력 index[3]
		AirlineDay ad = new AirlineDay(value);
				
		output.collect(new IntWritable(ad.getDay()), new IntWritable(1));
		
	}

	
}
