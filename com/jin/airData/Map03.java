package com.jin.airData;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Map03 extends Mapper<LongWritable, Text, Text, IntWritable>{

   @Override
   public void map(LongWritable key, Text value, Context output) throws IOException, InterruptedException {
      AirParser ap = new AirParser(value);
      
      if(ap.getDistance()>0) {
         output.write(new Text("Distance All"),
               new IntWritable(ap.getDistance()));
         output.getCounter(DistanceCount.nonZeroCnt).increment(1); //열거형 데이터<enum> // 핵심 (getCounter()의 처리를 보기 위해)
      } else if(ap.getDistance()==0) {
         output.getCounter(DistanceCount.zeroCnt).increment(1); //열거형 데이터<enum>
      }
   }
}