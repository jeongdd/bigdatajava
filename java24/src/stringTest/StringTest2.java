package stringTest;

public class StringTest2 {

	public static void main(String[] args) {
		String s1 = "I am a java programmer";
		String s2 = "I am a python programmer";
		String s3 = "20115211";
		System.out.println(s1.toString());
		
		// 참조값을 비교하는 것
		System.out.println(s1.equals(s2));
		// 객체에 들어있는 주소값을 비교
		System.out.println(s1 == s2);
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(7));
		System.out.println(s3.charAt(0));
		StringBuffer buffer = new StringBuffer("hello");
		System.out.println(buffer.charAt(0));
		System.out.println(s1.substring(1));  // 지정인덱스 이후 문자열을 다 가져옴
		System.out.println(s1.substring(7,11));
		String[] result = s1.split(" "); // return type -> string[]
		System.out.println(result.toString());
		for (String s : result) {
			System.out.println(s);
		}
		System.out.println("----------");
		String s5 = "Hi, Good Morning!";
		String[] result2 = s5.split(",");
		System.out.println(result2.length);
		for (String s : result2) {
			System.out.println(s);
		}
		System.out.println("----------");
		String s6 = "Hi. Good Morning!";
		String[] result3 = s5.split(".");
		System.out.println(result3.length);
		for (String s : result2) {
			System.out.println(s);
		}
		
		System.out.println(s6.indexOf("G")); //start 위치를 알려줌
		
		String s7 = "http://www.naver.com/member/index.jsp";
		System.out.println(s7.lastIndexOf("/")); // 마지막으로 나오는 인덱스 번호를 알려줌
		System.out.println(s7.substring(27));
		System.out.println(s7.substring(s7.lastIndexOf("/"))); //↑ 두 개의 코드와 같음
		
		System.out.println(s6.toUpperCase());  // 문자열 전체를 대문자로
		System.out.println(s6.toLowerCase()); // 문자열 전체를 소문자로
		
		String s66 = s6.replaceAll("Good", "best");
		System.out.println(s66);
//		System.out.println(s6.replaceAll("good", "best"));
		
		char[] result7 = s6.toCharArray(); // 문자열을 char 단위로 끊어냄
		for (char c : result7) {
			System.out.println(c);
		}
		
		String s8 = "   hello!! win !!   ";
		System.out.println(s8.trim());  // 앞 뒤 공백을 없애줌 -> 회원가입시 앞 뒤 공백을 넣었을 경우 잘라서 사용(실수할 때)
		
		System.out.println(s8.concat("final")); //기존 문자열에 다른 문자열을 붙일 때
		System.out.println(s8.contains("hello"));
		String s9 = "winner class";
		System.out.println(s9.startsWith("winner")); //boolean형 -> winner로 시작하나요?
		System.out.println(s9.endsWith("class"));  //boolean형 -> class로 끝나나요?
		String s10 = "haha@naver.com";
		System.out.println(s10.endsWith("com"));
		if(s10.endsWith("com")) {
			System.out.println("닷컴회사시군요.");
		}else {
			System.out.println("닷컴회사가 아니군요.");
		}
		
	}

}




























