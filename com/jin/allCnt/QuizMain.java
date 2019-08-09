package com.jin.allCnt;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class QuizMain extends Configured implements Tool {

	public static void main(String[] args) throws Exception {
		System.exit(ToolRunner.run(new QuizMain(), args));
	}

	@Override
	public int run(String[] arg0) throws Exception {
		JobConf conf = new JobConf(QuizMain.class);

		conf.setJobName("Quiz!");

		// 출력 형식
		conf.setOutputKeyClass(Text.class);
		conf.setOutputValueClass(IntWritable.class);

		// Map Reduce
		conf.setMapperClass(Map05.class);
		conf.setReducerClass(Reduce05.class);

		// 입출력 형식
		conf.setInputFormat(TextInputFormat.class);
		conf.setOutputFormat(TextOutputFormat.class);

		// 입출력 경로
		FileInputFormat.setInputPaths(conf, new Path(arg0[0]));
		FileOutputFormat.setOutputPath(conf, new Path(arg0[1]));

		JobClient.runJob(conf);

		return 0;
	}

}
