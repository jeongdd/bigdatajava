package java17;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		list.add("나는 스트링");
		list.add(100);
		list.add(11.12);
		list.add('a');
		System.out.println(list);  //override //다형성의 2차 -> 상속관계에 있을 때
		//하나의 이름으로 다양한 형태를 구현하는 자바의 특징 (다형성)
		

	}

}
