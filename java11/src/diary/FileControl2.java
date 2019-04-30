package diary;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileControl2 {

	public static void main(String[] args) throws Exception {
		// 파일에 저장
		// 객체 생성
		String name = JOptionPane.showInputDialog("이름을 입력.");
		String tel = JOptionPane.showInputDialog("전화번호를 입력.");
		String addr = JOptionPane.showInputDialog("주소를 입력.");
		FileWriter w = new FileWriter(name + ".txt"); 
		// 메소드 사용(호출)
		w.write(name + "\n");
		w.write(tel + "\n");
		w.write(addr + "\n");
		
		
		w.close(); //다 쓰고 난 뒤에는 close를 시켜줘야 한다.

	}

}
