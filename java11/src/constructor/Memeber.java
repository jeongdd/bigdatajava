package constructor;

public class Memeber {
	String name;
	int age;
	String tel;
	String addr;
	
	public Memeber(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}
	
	
	
	@Override
	public String toString() {
		return  name + "	" + age + "	" + tel + "	" + addr ;
	}
	
	
	
}
