package newclass;

public class Tv {

//TV => class
//- 정적특성 : 전원버튼 유무, 사이즈, 색 => 멤버변수
	boolean power;
	int size;
	String color;
//- 동적특성 : 채널변경하다, 소리를 조절하다, 잭연결하다. =>멤버 메소드
	// 범위 지정 - public, private...
	public void changeCh() {
		System.out.println("채녈 변경하다.");
	}
	public void sound() {
		System.out.println("소리를 조절하다.");
	
	}
	public void connect() {
		System.out.println("잭 연결하다.");
	}
	
	@Override //표시기능 -> 지워도 됨
		public String toString() {
			return power + " " + size + " " + color;
		}
	
}















































