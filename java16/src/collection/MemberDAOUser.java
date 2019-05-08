package collection;

import java.util.ArrayList;

public class MemberDAOUser {
	
	public static void main(String[] args) {
		// 멤버 리스트를 리턴받아
		MemberDAO dao = new MemberDAO();
		dao.selectAll();
		ArrayList list = dao.selectAll();
		System.out.println(list);
		System.out.println("----------------");
		// 전체 출력
		for (int i = 0; i < list.size(); i++) {
			MemberDTO dto  = (MemberDTO)list.get(i);
			System.out.println(dto.getNum());
			System.out.println(dto.getId());
			System.out.println(dto.getPw());
			System.out.println(dto.getName());
			System.out.println(dto.getEmail());
			System.out.println(dto.getHome());
			System.out.println(dto.getGender());
			System.out.println(dto.getAge());
			System.out.println("----------------");
		}
		
	}
	
}
