package com.jin.allCnt;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class Map01 extends MapReduceBase 
implements Mapper<LongWritable, Text, Text, IntWritable>{

	@Override
	public void map(LongWritable key, Text value, 
			OutputCollector<Text, IntWritable> output, Reporter arg3) throws IOException {
		
		//String quizData[] = value.toString().split(",");
		
		// output.collect(new Text(quizData[0]), new IntWritable(1));   //년별 운항횟수 출력
		// output.collect(new Text(quizData[1]), new IntWritable(1));  //월별 운항횟수 출력
		
		// 년 월 합쳐서
		//String airData = quizData[0] + "년" + quizData[1] + "월";
		//output.collect(new Text(airData), new IntWritable(1));
		
		// 년 ,월 정렬해서 출력
		//AirlineParser ap = new AirlineParser(value);
		//String yearMonth = String.format("%d년 %02d월", ap.getYear(),Integer.parseInt(ap.getMonth()));
		// Integer.parseInt(ap.getMonth()) -> getter가 String이기 때문에 변환 해야함
		//String.format("%5d", 10); // 결과값  :    10(앞에 공백 4개 / 다섯번째부터 출력)
		//output.collect(new Text(yearMonth), new IntWritable(1));
		// 200x년 xx월 => key를 새로 만듦 (new Text(yearMonth)) 
		
		// 요일별 출력 index[3]
		AirlineDay ad = new AirlineDay(value);
				
		output.collect(new Text(String.valueOf(ad.getDay())), new IntWritable(1));
		
		
		
		
	}

	
}
