package 배열;

public class 배열연습5 {

	public static void main(String[] args) {
		double eye[] = {1.5, 2.0, 0.7, 0.5, 1.2};
		char gender[] = {'남', '남', '여', '여','여'};
		char score[] = {'A','C','F','B','A'};
		String name[] = {"홍길동","김길순","홍길자","박길순","이길동"};
		int com[] = {44,55,67,88,35};
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i]);
			System.out.print(gender[i]);
			System.out.print(score[i]);
			System.out.print(name[i]);
			System.out.print(com[i]);
			System.out.println();
		}
	}

}
