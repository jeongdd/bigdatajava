package 반복문;

public class ForTest2 {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) { // 처리용도/ 카운트 용도 -> 카운트 용도
				System.out.print("☆");
			}
			System.out.println();	
		}
	}
}
