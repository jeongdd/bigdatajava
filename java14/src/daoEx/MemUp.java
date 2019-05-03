package daoEx;

import javax.swing.JOptionPane;

public class MemUp {
	
	public static void main(String[] args) {
//		# update
		
		String pw = JOptionPane.showInputDialog("PW 입력 : ");
		String id = JOptionPane.showInputDialog("ID 입력 : ");
		
		System.out.println("----회원 정보 수정----");
		System.out.println("PW : ");
		System.out.println("ID : ");
		
		MemberUpdate mem2 = new MemberUpdate();
		try {
			mem2.update(pw, id);
		} catch (Exception e) {
			System.out.println("!!!!Error!!!!!");
			e.printStackTrace();
		}
		
	}

}


























