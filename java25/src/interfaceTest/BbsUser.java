package interfaceTest;

public class BbsUser {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO("kim","ktitle","contentkkk","kimkim");
		dao.insert(dto);
		dao.update(dto);
		dao.delete("kim");
		MemberDTO dto2 = dao.select("kim");
	}

}
