package collection;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		// 순서가 중요.
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		int size = list.size();
		System.out.println("리스트의 개수는 " + size + "개 입니다.");
		System.out.println(list); //tostring() override
		list.remove(1);
		System.out.println(list);
		list.add(1, "뉴인물"); //index를 줘서 중간에 삽입
		System.out.println(list);
		list.set(1, "올드인물");
		System.out.println(list); //index로 값 수정
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "등 : " + list.get(i));
		}
//		list.remove(0);
//		System.out.println(list); 		
//		list.remove(1);
//		System.out.println(list); 		
	}

}
