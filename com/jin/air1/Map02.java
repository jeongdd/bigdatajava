package com.jin.air1;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Map02 extends Mapper<LongWritable, Text, Text, Text> {
	   @Override
	   public void map(LongWritable key, Text value, Context context) 
	         throws IOException, InterruptedException {
	      
	      AirParser ap = new AirParser(value);
	      
	      if(ap.getActualElapsedTi() > 0 && ap.getCRSElapsedTime() > 0) {
	    	  Text txt1 = new Text(ap.getUniqueCarrier() + "," + ap.getTailNum() + "," + ap.getActualElapsedTi());
	    	  Text txt2 = new Text(ap.getUniqueCarrier() + "," + ap.getTailNum() + "," + ap.getCRSElapsedTime());
	    	  // , 를 기준으로 식별함
	    	  context.write(new Text("Actual"),txt1);
	    	  context.write(new Text("CRS"),txt2);
	      }
	      
	   }
}
