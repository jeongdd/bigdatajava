package jdbc;

import javax.swing.JOptionPane;

public class DBUpdate {

	public static void main(String[] args) {
		
		String tel = JOptionPane.showInputDialog("TEL 입력");
		String id = JOptionPane.showInputDialog("ID 입력");
		System.out.println("----수정 정보 입력----");
		
		DBProcessing3 db3 = new DBProcessing3();
		try {
			db3.update(tel, id);
		} catch (Exception e) {
			System.out.println("!!!!!!!!!Error!!!!!!!!!");
			e.printStackTrace();
		}
		

		
	}

}
