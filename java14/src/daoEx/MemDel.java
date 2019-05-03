package daoEx;

import javax.swing.JOptionPane;

public class MemDel {
	
	public static void main(String[] args) {
//		#delete

		MemberDelete mem3 = new MemberDelete();
		
		String id = JOptionPane.showInputDialog("ID 입력 : ");
		try {
			mem3.delete(id);
		} catch (Exception e) {
			System.out.println("!!!!Error!!!!!");
			e.printStackTrace();
		}
		
	}

}


























