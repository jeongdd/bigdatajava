package 배열;

public class 배열연습2 {

	public static void main(String[] args) {
		int [] score = {44, 66, 22, 88};
		System.out.println(score.length);
		
		score[0] = 55;
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
	}

}
