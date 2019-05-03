package daoEx;

import javax.swing.JOptionPane;

public class MemberMain {
	
	static String id;
	static String pw;
	static String name;
	static String email;
	static String home;
	static String gender;
	static int age;
	
	public static void main(String[] args) {

//		#insert
		id = JOptionPane.showInputDialog("ID 입력 : ");
		pw = JOptionPane.showInputDialog("PW 입력 : ");
		name = JOptionPane.showInputDialog("NAME 입력 : ");
		email = JOptionPane.showInputDialog("E-MAIL 입력 : ");
		home = JOptionPane.showInputDialog("주소 입력 : ");
		gender = JOptionPane.showInputDialog("성별 입력: ");
		age = Integer.parseInt(JOptionPane.showInputDialog("나이 입력 : "));
		
		System.out.println("----회원 가입 정보 입력 ----");
		System.out.println("ID : " + id);
		System.out.println("PW : " + pw);
		System.out.println("NAME : " + name);
		System.out.println("E-MAIL : " + email);
		System.out.println("주소 : " + home);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		
		MemberDAO mem1 = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		
//		mem1[0] = dto.setId(id);
		
		try {
			mem1.insert(dto);
		} catch (Exception e) {
			System.out.println("!!!!Error!!!!!");
			e.printStackTrace();
		}
		
		
	}

}


























