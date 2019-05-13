package java19;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add("휴대폰");
		bag.add("지갑");
		System.out.println("내 가방속에 있는 물건의 개수 : " + bag.size() + "개");
		System.out.println(bag);
		bag.add("지갑");  // 자동으로 중복값을 체크해줌 , 순서도 없음
		System.out.println(bag);
	}

}
