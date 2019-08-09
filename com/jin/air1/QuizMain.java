package com.jin.air1;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class QuizMain extends Configured implements Tool {
	public static void main(String[] args) throws Exception {
		// System.exit(ToolRunner.run(new QuizMain(), args));
		// 위에 코드랑 같음
		int exitCode = ToolRunner.run(new QuizMain(), args);
		System.exit(exitCode);
	}

	@Override
	public int run(String[] arg0) throws Exception {
		String MultipleId[] = {"Actual", "CRS"};
		Job conf = Job.getInstance(getConf(), "ArrDep");
		
		// conf.setJobName("delay count");
		
		conf.setMapOutputKeyClass(Text.class);
		conf.setMapOutputValueClass(Text.class);
		
		// 출력 형식 지정
		conf.setOutputKeyClass(Text.class);
		conf.setOutputValueClass(Text.class);

		// Map Reduce
		conf.setMapperClass(Map02.class);
		conf.setReducerClass(Reduce02.class); 

		// 입출력 형식 지정
		conf.setInputFormatClass(TextInputFormat.class);
		conf.setOutputFormatClass(TextOutputFormat.class);
		
		
		// 입출력 경로 지정 // args0 들의 입출력 경로를 지정함
		FileInputFormat.setInputPaths(conf, new Path(arg0[0]));
		FileOutputFormat.setOutputPath(conf, new Path(arg0[1]));

		MultipleOutputs.addNamedOutput(conf, MultipleId[0], TextOutputFormat.class, Text.class, IntWritable.class);
		MultipleOutputs.addNamedOutput(conf, MultipleId[1], TextOutputFormat.class, Text.class, IntWritable.class);
		// JobClient.runjob(conf); // map01
		conf.waitForCompletion(true); 
		
		
		
		

		return 0;
	}

}