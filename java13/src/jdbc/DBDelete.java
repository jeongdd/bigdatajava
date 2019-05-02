package jdbc;

import javax.swing.JOptionPane;

public class DBDelete {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("ID 입력");
		System.out.println("----삭제 정보 입력----");
		
		DBProcessing4 db4 = new DBProcessing4();
		try {
			db4.delete(id);
		} catch (Exception e) {
			System.out.println("!!!!!!!!!Error!!!!!!!!!");
			e.printStackTrace();
		}
		
		
	}

}
