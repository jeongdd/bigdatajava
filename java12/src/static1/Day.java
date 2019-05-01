package static1;

public class Day {
	String doing;
	int time;
	String location;
	static int count; //instance 변수
	static int totalT;
	static int aveT;

	
	public Day() {
		
	}

	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		totalT = totalT + time;
		aveT = totalT / 3;
	}
	
	public static int getTotal() {
		return totalT;
		//static 메소드내에 사용되는 멤버변수는 반드시 static변수만 가능
		// 객체 생성과 산관 없이  클래스 이름으로 접근 가능한 변수
	}


	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}
