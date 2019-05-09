package java17;

public class HightStudent extends Student{
	boolean Examinee;
	
	@Override
	public void study() {
		System.out.println("수능공부를 합니다.");
	}
	
	public void selfStudy() {
		System.out.println("야자를 합니다.");
	}
}
