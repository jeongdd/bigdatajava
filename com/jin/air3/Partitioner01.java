package com.jin.air3;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Partitioner;

import com.jin.air2.PartSort;

public class Partitioner01 extends Partitioner<PartSort, IntWritable>{

	@Override
	public int getPartition(PartSort key, IntWritable value, int numPartitions) {
		int hash = key.getYear().hashCode();
		int partition = hash % numPartitions;  // slave의 개수만큼 지정되는것 자동으로
		
		return partition;
	}
	
}
