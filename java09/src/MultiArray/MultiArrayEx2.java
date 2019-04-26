package MultiArray;

public class MultiArrayEx2 {

	public static void main(String[] args) {
//		---------------------------
//		- 1반은 44,55,66
//		- 2반은 77,88,99,99,100

//		각 반의 평균을 구하세요
//		전체 출력//		---------------------------
		System.out.println("----------------------");
		int scores[][] = {
					{44,55,66},
					{77,88,99,100}
					};

		int sum =0;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				sum = sum + scores[i][j];
			}
			System.out.println(i+1 + "반의 평균은: " + sum/scores[i].length );
			sum = 0;
		}
		System.out.println("----------------------");
	}
}
