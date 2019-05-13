package java19;

import java.util.HashMap;

public class MapEx2 {

	public static void main(String[] args) {
		HashMap boardlist = new HashMap();
		Board b1 = new Board("제목1","내용1","admin","ad2224");
		Board b2 = new Board("제목2","내용2","root","fdf5552");
		Board b3 = new Board("제목1","내용3","user","ddssd2121");
		boardlist.put(100, b1);
		boardlist.put(200, b2);
		boardlist.put(300, b3);
		System.out.println(boardlist);
		
		
	}

}
