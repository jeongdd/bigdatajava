package newclass;

public class MyRoom {

	public static void main(String[] args) {
		Phone p1 = new Phone(); //전에 만든 클래스 호출
		p1.company = "apple";
		p1.shape = "네모";
		p1.size = 11;
		
		System.out.println(p1.company);
		System.out.println(p1.shape);
		System.out.println(p1.size);
		
		p1.call();
		p1.text();
		p1.alarm();
		
		Phone p2 = new Phone();
		
		p1.company = "samsung";
		p1.shape = "동그라미";
		p1.size = 10;
		
		System.out.println(p2.company);
		System.out.println(p2.shape);
		System.out.println(p2.size);
		
		
		System.out.println("-----------------");
		
		System.out.println("#tv1");
		// 생성자이용
		Tv tv1 = new Tv();
		tv1.color = "검정색";
		tv1.power = true;
		tv1.size = 50;
//		System.out.println(tv1.color);
//		System.out.println(tv1.power);
//		System.out.println(tv1.size);
		
		System.out.println(tv1); // toString이 자동 사용됨
		
		tv1.changeCh();
		tv1.connect();
		tv1.sound();
		
		System.out.println("#tv2");
		
		// class를 복사해서 만든 tv2를 객체(대상,object)
		// new의 역할 : 객체 생성
		// 멤버변수는 알아서 초기값을 지정함
		
		Tv tv2 = new Tv(); 
		tv2.color = "회색";
		tv2.power = true;
		tv2.size = 80;
//		System.out.println(tv2.color);
//		System.out.println(tv2.power);
//		System.out.println(tv2.size);
		
		System.out.println(tv2);
		
//		System.out.println(tv2);
	}

}
















