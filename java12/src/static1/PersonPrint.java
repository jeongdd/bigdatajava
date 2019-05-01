package static1;

public class PersonPrint {

	public static void main(String[] args) {
		Person p1 = new Person(185, 78, "비밀없음","구로구");
		Person p2 = new Person(165, 55, "비밀 123423243","종로구");
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("p1 님의 적정 몸무게는 " + (p1.height - 100) * 0.9 + "kg 입니다.");
		System.out.println("p2 님의 적정 몸무게는 " + (p2.height - 100) * 0.9 + "kg 입니다.");
	}

}
