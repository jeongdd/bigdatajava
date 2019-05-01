package static1;

public class Doughters {
	String name;
	int age;
	static int money;
	static int getMoney;
	
	
	public Doughters() {

	}

	public Doughters(String name, int age) {
		this.name = name;
		this.age = age;
		money = 10000;
		getMoney = 2000;
		getMoney += getMoney;
	}
	
	public void play1() {
		System.out.println(name + "는 친구와 컴퓨터 게임을 합니다.");
	}
	public void play2() {
		System.out.println(name + "는 집에서 인형과 놉니다.");
	}
	
	@Override
	public String toString() {
		return "Doughters [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
