package constructorEx;

public class Asset {
	String product;
	String name;
	int money;
	
	public Asset() {

	}


	public Asset(String product, String name, int money) {
		this.product = product;
		this.name = name;
		this.money = money;
	}


	@Override
	public String toString() {
		return product + "		" + name + "		" + money + "만원";
	}
	
	
	
}
