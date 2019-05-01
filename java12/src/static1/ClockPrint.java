package static1;

public class ClockPrint {

	public static void main(String[] args) {
		Clock c1 = new Clock(5000,"벽걸이시계", 3 , "시계전자");
		Clock c2 = new Clock(10000, "시계나라");
		Clock c3 = new Clock(25000, 2, "시계시계");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("1. 회사명 : " + c1.company + "	가격 : " + c1.price + "원");
		System.out.println("2. 회사명 : " + c2.company + "	가격 : " + c2.price + "원");
		System.out.println("3. 회사명 : " + c3.company + "	가격 : " + c3.price + "원");
	}

}
