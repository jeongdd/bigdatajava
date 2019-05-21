package interfaceTest;

public class MemberDAO implements MemberInterface {

	@Override
	public void insert(MemberDTO dto) {
		System.out.println("회원가입");
	}

	@Override
	public void delete(String id) {
		System.out.println("회원탈퇴");
		
	}

	@Override
	public void update(MemberDTO dto) {
		System.out.println("회원수정");
		
	}

	@Override
	public MemberDTO select(String id) {
//		MemberDTO dto; //선언만 해서 쓰레기값이 들어감(자동초기화X - 지역변수이기 때문) // 전역변수는 자동초기화 O
		MemberDTO dto = new MemberDTO("park","park","park","park"); // 주소값이 들어감
		return dto;
	}
	
	
}
