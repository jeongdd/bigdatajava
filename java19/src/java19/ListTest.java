package java19;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("나는 스트링");
		list.add(100);
		list.add(11.22);
		list.add(true);
		
		int num = (Integer)list.get(1);
		
		MemberDTO dto = new MemberDTO("java","java","java","java");
		list.add(dto);
		list.remove(3);
		System.out.println(list);
		
	}

}
