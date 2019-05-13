package java19;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");
		
		System.out.println("순위표!");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "등" + list.get(i));
		}
		System.out.println();
		System.out.println("※ 2등 김정민 반칙으로 탈락!※");
		list.remove(1);
		System.out.println();
		
		System.out.println("<순위 재정의>");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "등" + list.get(i));
		}
	}

}



















