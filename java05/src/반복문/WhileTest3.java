package 반복문;

public class WhileTest3 {

	public static void main(String[] args) {
		// 두 개의 입력값을 받아서,
		// 첫 번째 값 부터 두 번째 값 까지 더함.
		int num1 = 11; //초기값(시작 값)
		int num2 = 20;
		
		int sum = 0;
		while(num1 <= num2) { // 조건식
			//더하는 식
			sum =  sum + num1;
			//증감식
			num1++;
		}
		System.out.println(num1 + "와" + num2+ "의 합은" + sum);
	}

}
