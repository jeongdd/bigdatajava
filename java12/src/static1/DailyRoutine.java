package static1;

public class DailyRoutine {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count + "일차"); // 클래스 이름을 원본 그대로 사용할 수 있다.
		System.out.println(day1);
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count + "일차");
		System.out.println(day2);
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count + "일차");
		System.out.println(day3);
		System.out.println("=> 총 " + Day.count + "일간 활동 했습니다.");
		
		System.out.println();
		System.out.println("전체 하는 일의 시간은? " + Day.totalT + "시간 입니다.");
		System.out.println("평균 하는 일의 시간은? " + Day.aveT + "시간 입니다.");
		System.out.println(Day.getTotal());
	}

}
