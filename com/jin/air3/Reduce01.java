package com.jin.air3;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class Reduce01 extends Reducer<PartSort, IntWritable, Text, IntWritable> {

	public void reduce(PartSort key, Iterable<IntWritable> values, Context ctx)
			throws IOException, InterruptedException {

		int cnt = 0;
		for(IntWritable v : values) {
			cnt += v.get();
		}
		ctx.write(new Text(key.getYear()+ "." + key.getMonth()),new IntWritable(cnt));
	}

}