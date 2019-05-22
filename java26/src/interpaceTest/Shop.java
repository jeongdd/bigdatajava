package interpaceTest;

public class Shop implements Shape, Pay {

	public void 계산하다() {
		System.out.println("돈을 지불하다.");

	}

	@Override
	public void size() {
		System.out.println("가게의 문을 동그랗게 할 예정인데 사이즈를 정해야한다.");
	}

	@Override
	public void 반지름을구하다() {
		System.out.println("문의 반지름을 구하고싶다,");
	}

}
