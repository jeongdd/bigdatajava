package collection;

import java.util.ArrayList;

public class MemberDAO {
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		// dto를 3개 만들어서 list로 묶으세요.
		// 그 리스트를 리턴.
		MemberDTO d1 = new MemberDTO(1,"100","1234","hong","hong@hong.com","종로구","male",35);
		MemberDTO d2 = new MemberDTO(2,"200","7894","kim","kim@kim.com","강남구","female",44);
		MemberDTO d3 = new MemberDTO(3,"300","4568","lee","lee@lee.com","금천구","female",27);
		
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		
		return list;
	}
}
