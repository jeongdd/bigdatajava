package com.jin.air1;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

public class Reduce01 extends Reducer<Text, IntWritable, Text, IntWritable> {

	private MultipleOutputs<Text, IntWritable> multi;
	
	@Override
	protected void setup(Context ctx) {
		multi = new MultipleOutputs<Text, IntWritable>(ctx);
	}
	private void multicount(String namedOutput, String key, Iterable<IntWritable> values) throws IOException, InterruptedException {
		
		int cnt = 0;
		
		for (IntWritable v : values) 
			cnt += v.get();
		
		multi.write(
				namedOutput/*namedOutput : 출력되는 이름*/,
				key/*key : 기존 key*/,
				new IntWritable(cnt)/*value : 기존 value*/);
		
	}
	public void reduce(Text key, Iterable<IntWritable> values, Context output)
			throws IOException, InterruptedException {
		String cmd[] = key.toString().split(":");
		
		/*
		 * if("dep".equalsIgnoreCase(cmd[0])) multicount("dep", cmd[1], values);
		 * if("arr".equalsIgnoreCase(cmd[0])) multicount("arr", cmd[1], values);
		 */
		
		if("dep".equalsIgnoreCase(cmd[0]) || "arr".equalsIgnoreCase(cmd[0]))
			multicount(cmd[0], cmd[1], values);
	}
	
	@Override
	protected void cleanup(Context ctx) throws IOException, InterruptedException{
		multi.close();
	} 
}