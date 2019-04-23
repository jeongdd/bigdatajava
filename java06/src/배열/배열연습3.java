package 배열;

public class 배열연습3 {

	public static void main(String[] args) {
		int [] num = {444, 666, 777}; // = int num[] 
//		배열 첫번째 값에 세번째 값을 넣어보세요.
		num[0] = num[2]; // 복사(대입)의 개념 => 기존 값은 사라지고 넣을 값을 덮어씌움
//		첫번째 값 확인, 세번째 값 확인.
		System.out.println(num[0]);
		System.out.println(num[2]);
	}

}
