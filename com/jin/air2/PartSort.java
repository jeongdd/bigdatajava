package com.jin.air2;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableUtils;

public class PartSort extends AirParser
implements WritableComparable<PartSort>{

	public PartSort() { } //default 생성자
	
	public PartSort(Text value) {
		super(value);
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		super.setYear(WritableUtils.readString(in));  // 문자열 처리  ==> AirParser에서 int 값을 String으로 바꾼 이유
		super.setMonth(in.readInt());				  // 숫자 처리
	}

	@Override
	public void write(DataOutput out) throws IOException {
		// AirParser에  AirParser 변수가 있는 생성자에서 사용됨
		WritableUtils.writeString(out, super.getYear());	// 문자열 처리
		out.writeInt(super.getMonth());						// 숫자 처리
		
	}

	@Override
	public int compareTo(PartSort data) {
		int result = super.getYear().compareTo(data.getYear());   //1차 정렬 -> 문자열 정렬
		if(0 == result) {
			return super.getMonth() - data.getMonth();	//2차 정렬 -> 숫자 정렬
		}
		return result;
		
	}
	
}
