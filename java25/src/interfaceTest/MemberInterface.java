package interfaceTest;

public interface MemberInterface {

	// 강제성있는 기능을 추상 메소드로 정의 -> 기능구현 X
	// 일반 변수 사용 불가 , 일반 메소드 사용 불가
	// 상수 사용 가능.
	// 추상적 <-> 구체적
	// 추상 : 불완전하다.
	// 객체를 생성하여 쓸 수 없다.
	// interface는 무조건 기본값이 public abstract
	// 설계도의 개념
	
	public abstract void insert(MemberDTO dto);
	void delete(String id);
	void update(MemberDTO dto);
	MemberDTO select(String id);
}
			