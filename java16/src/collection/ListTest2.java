package collection;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "등 : " + list.get(i));
		}
		list.remove(1);
		System.out.println("-----------------------------");
		System.out.println("# 김정민님이 탈락했습니다. 순위가 변경되었습니다.#");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "등 : " + list.get(i));
		}		
	}

}
