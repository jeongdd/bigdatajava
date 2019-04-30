package constructorEx;

public class Bank {

	public static void main(String[] args) {
		
		Asset a1 = new Asset("청약저축", "김아무개", 500);
		Asset a2 = new Asset("내 비상금", "김아무개딸", 30);
		Asset a3 = new Asset("자유적금" , "박아무개" , 100);
		
		int totalA = a1.money + a2.money + a3.money;
		
		System.out.println("상품명 product"+"	" + "예금주 name" + "	" + "예금액 money");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println(a2.product + " 통장에는 " + a2.money + "만원이 들어있어요.");
		System.out.println(a3.name + " 통장에는 " + a3.money + "만원이 들어있어요.");
		System.out.println();
		System.out.println("우리 집 전체 예금액은  " + totalA + "만원 이에요!");
		System.out.println("---------------------------------------------");
		
		
	}

}
