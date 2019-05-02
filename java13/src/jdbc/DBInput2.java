package jdbc;

import javax.swing.JOptionPane;

public class DBInput2 {

	public static void main(String[] args) {
		
		String pw = JOptionPane.showInputDialog("PW 입력");
		String id = JOptionPane.showInputDialog("ID 입력");
		String name = JOptionPane.showInputDialog("NAME 입력");
		String tel = JOptionPane.showInputDialog("TEL 입력");
		System.out.println("----회원 가입 정보 입력 ----");
		System.out.print("ID : ");
		System.out.print("PW : ");
		System.out.print("NAME : ");
		System.out.print("TEL : ");
		
		DBProcessing db = new DBProcessing();
		try{
			db.insert(id, pw, name, tel);
		}catch(Exception e){
			System.out.println("Error!!Error!!");
			e.printStackTrace();
		}
		
	}

}
