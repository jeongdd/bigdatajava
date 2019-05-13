package java19;

import java.util.HashSet;

public class SetEx {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("디자이너");
		bag.add("프로그래머");
		bag.add("DB관리자");
		
		System.out.println(bag);
		
		System.out.println("팀에 프로그래머가 있나요?" + bag.contains("프로그래머"));
		
	}

}
