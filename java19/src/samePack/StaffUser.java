package samePack;

public class StaffUser {

	public static void main(String[] args) {
		Staff work = new Staff();
		work.age = 100; //default = 같은 package 접근 가능
		work.name = "park";
		work.salary = 100; // 상속관계에 있을 때 접근 가능
		
//		work.ssn = "100101";
	}

}
