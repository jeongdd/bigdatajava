package static1;

public class Dadwallet {

	public static void main(String[] args) {
		
		Doughters d1 = new Doughters("김아무개1", 15);
		Doughters d2 = new Doughters("김아무개2", 5);
		
		System.out.println(d1);
		d1.play1();
		System.out.println(d2);
		d2.play2();
		
		System.out.println();
		
		System.out.println("두 딸은 용돈을 " + Doughters.getMoney / 2 + "원씩 받습니다.");
		System.out.println("아빠의 남은 돈은 " + (Doughters.money - Doughters.getMoney) + "원 입니다.");
	}

}
