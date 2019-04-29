package newclass;

public class Calculator {

	//자바는 메소드 이름을 동일하게 할 수 있다.
	//하나의 이름으로 동일한 기능을 표현하게 하는 기능.
	//다형성(overloading, 오버로딩)
	
	//add(200, 100) -> 값을 두개를 지정해주면 두개를 꼭 써야한다. 이상&이하 X
	public int add(int x , int y) {
		return x + y;
	}
	//add(200, 11.11)
	public void add(int x, double y) {
		System.out.println(x + y);
	}
	
	//add("홍길동", 1000) : ok
	//add(1000, "홍길동") : not!
	//add("홍길동") : not!
	//입력값의 개수, 타입, 순서가 중요!
	//입력값에 사용되는 변수를 매개변수(파라메터, parameter)
	public void add(String x, int y) {
		System.out.println(x + y);
	}
	

}

























