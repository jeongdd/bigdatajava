package 배열;

public class Example4 {

	public static void main(String[] args) {
		
		int su[] = {11, 22, 33, 44};
		
		for (int i = 0; i < su.length; i++) { //배열의 index와 관련
			if(su[i] == 33) {
				System.out.println("33의 위치는 su[" + i + "]입니다.");
			}
		}
	}

}
