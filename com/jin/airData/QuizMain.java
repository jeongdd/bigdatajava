package com.jin.airData;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class QuizMain extends Configured implements Tool {
	public static void main(String[] args) throws Exception {
		System.exit(ToolRunner.run(new QuizMain(), args));
	}

	@Override
	public int run(String[] arg0) throws Exception {

		Job conf = Job.getInstance(getConf(), "ArrDep");

		// conf.setJobName("delay count");

		// 출력 형식 지정
		conf.setOutputKeyClass(Text.class);
		conf.setOutputValueClass(IntWritable.class);

		// Map Reduce
		conf.setMapperClass(Map04.class);
		//conf.setReducerClass(Reduce04.class); //04에선 안돌려도 됨.

		// 입출력 형식 지정
		conf.setInputFormatClass(TextInputFormat.class);
		conf.setOutputFormatClass(TextOutputFormat.class);
		
		
		// 입출력 경로 지정 // args0 들의 입출력 경로를 지정함
		FileInputFormat.setInputPaths(conf, new Path(arg0[0]));
		FileOutputFormat.setOutputPath(conf, new Path(arg0[1]));

		// JobClient.runjob(conf); // map01
		conf.waitForCompletion(true); // map02, map03
		
		//<map 03>
		//long nonZeroCnt = conf.getCounters().findCounter(DistanceCount.nonZeroCnt).getValue();
		//long zeroCnt = conf.getCounters().findCounter(DistanceCount.zeroCnt).getValue();
		//System.out.println("nonZeroCnt : " + nonZeroCnt);
		//System.out.println("zeroCnt : " + zeroCnt);  
		
		for (Month mon : Month.values()) {
			System.out.println(mon + ":" + conf.getCounters().findCounter(mon).getValue());
		}
		
		/*
		 * 위에랑 같음 ㅇㅅㅇ....
			Map04 map = new Map04();
		 * for (int i = 0; i < 12; i++) {
			 long nonZeroCnt = conf.getCounters().findCounter(Month.values()[i]).getValue();  
	            System.out.println(Month.values()[i] + " : " + nonZeroCnt);
	         }*/
		
		

		return 0;
	}

}