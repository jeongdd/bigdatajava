package interfaceExam;

public class MelonPhone implements Phone {

	@Override
	public void call() {
		System.out.println("전화를 한다.");
	}

	@Override
	public void music() {
		System.out.println("음악을 듣는다.");
	}

	@Override
	public void message() {
		System.out.println("메세지를 보낸다.");
	}

}
