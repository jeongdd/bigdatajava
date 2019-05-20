package stringTest;

public class StringTest1 {

	public static void main(String[] args) {
		String s1 = "winner";
		String s2 = "success";
		String s3 = "winner";
		String s4 = new String();
		System.out.println(s1);  // 기본적으로 toString override 되어있어서 char값이 찍히게 되는것
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.hashCode()); // 주소값
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
