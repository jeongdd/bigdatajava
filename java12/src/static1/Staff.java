package static1;

public class Staff {
	String name;
	String gender;
	int age;
	static int count;
	static int aveA;
	
	public Staff() {

	}

	public Staff(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		count = count++;
		count = count + 1;
		aveA += age;
	}
	
	public void work(String name) {
		System.out.println(name + "는 일합니다.");
	}

	public void friendly(String name) {
		System.out.println(name + "는 친화력 있다.");
	}
	
	@Override
	public String toString() {
		return "Staff [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
