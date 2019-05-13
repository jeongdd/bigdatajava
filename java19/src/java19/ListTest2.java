package java19;

import java.util.ArrayList;

public class ListTest2 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//String(작 , 자식) -> Object(큰, 부모)
		//자동 형변환 , 업캐스팅
		list.add("나는 스트링"); 
		list.add(100);
		System.out.println(list);
		
		//Object(큰, 부모) -> String(작 , 자식)
		//강제 형변환 , 다운캐스팅
		String name = (String)list.get(0);
		
	}
}
