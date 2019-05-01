package static1;

public class Open {

	public static void main(String[] args) {
		Staff st1 = new Staff("임아무개" , "남" , 24);
		Staff st2 = new Staff("김아무개" , "여" , 23);
		Staff st3 = new Staff("박아무개" , "남" , 25);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println("=> 전체 직원수는 " + Staff.count + "명 입니다.");
		System.out.println("=> 직원들의 평균 나이는 " + Staff.aveA / Staff.count + "세 입니다.");
		System.out.println("=> 첫번째 직원의 이름은  " + st1.name + " 입니다.");
		
	}

}
