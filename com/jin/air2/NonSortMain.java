package com.jin.air2;

import org.apache.hadoop.conf.Configuration;
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

public class NonSortMain extends Configured implements Tool {
	public static void main(String[] args) throws Exception {
		// System.exit(ToolRunner.run(new QuizMain(), args));
		// 위에 코드랑 같음
		int exitCode = ToolRunner.run(new Configuration(), new NonSortMain(), args);
		System.exit(exitCode);
	}

	@Override
	public int run(String[] arg0) throws Exception {
		Job conf = Job.getInstance(getConf(), "NonSort");
		
		// 입출력 경로 지정 // args0 들의 입출력 경로를 지정함
		FileInputFormat.addInputPath(conf, new Path(arg0[0]));
		FileOutputFormat.setOutputPath(conf, new Path(arg0[1]));;
		
		conf.setJarByClass(NonSortMain.class);
		// conf.setSortComparatorClass(PartsortComparator.class);  //key를 기반으로 정렬 (map과 reduce 사이에서)
		conf.setGroupingComparatorClass(PartsortComparator.class);  //어떤 기준으로 group화 시킬지 정하는 정렬
		
		conf.setMapperClass(Map01.class);
		conf.setReducerClass(Reduce01.class);
		
		// 입출력 형식 지정
		conf.setInputFormatClass(TextInputFormat.class);
		conf.setOutputFormatClass(TextOutputFormat.class);
		
		conf.setMapOutputKeyClass(PartSort.class);
		conf.setMapOutputValueClass(IntWritable.class);
		
		// 출력 형식 지정
		conf.setOutputKeyClass(Text.class);
		conf.setOutputValueClass(IntWritable.class); 

		conf.waitForCompletion(true); 
		
		return 0;
	}

}