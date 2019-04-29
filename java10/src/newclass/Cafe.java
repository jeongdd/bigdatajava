package newclass;

public class Cafe {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
//		cal.add(200, 200);
//		cal.add("엄마", 1000);
		int sum = cal.add(5000, 4000);
		System.out.println(sum - 1000 + "원만 내세요.");
	}

}
