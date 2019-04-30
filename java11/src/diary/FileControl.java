package diary;

import java.io.FileWriter;
import java.io.IOException;

public class FileControl {

	public static void main(String[] args) throws Exception {
		// 파일에 저장
		// 객체 생성
		FileWriter w = new FileWriter("start.txt"); 
		// 메소드 사용(호출)
		w.write("안녕하세요.\n");
		w.write("반갑습니다.\n");
		
		
		w.close(); //다 쓰고 난 뒤에는 close를 시켜줘야 한다.

	}

}
