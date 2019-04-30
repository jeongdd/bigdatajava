package constructorEx;

public class Info {

	public static void main(String[] args) {
		Member m1 = new Member("admin", "1234", "관리자", 1000);
		Member m2 = new Member("manager", "pass", "준관리자", 1500);
		Member m3 = new Member("sitemanager", "sitepass", "준관리자", 1800);
		
		int totalP = m1.point + m2.point + m3.point ;
		int aveP = totalP / 3;
		
		
		
		System.out.println("<다음과 같이 출력>");
		System.out.println(m1.id + "의 비밀번호는 " + m1.pw + "입니다.");
		System.out.println(m2.id + "는 " + m2.grade + "이고 마일리지는 " + m2.point + "입니다.");
		System.out.println("총 마일리지는 " + totalP + "입니다.");
		System.out.println("평균 마일리지는 " + aveP + "입니다.");
	}

}
