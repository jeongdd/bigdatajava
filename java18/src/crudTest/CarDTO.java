package crudTest;

public class CarDTO {
	private String id;
	private String name;
	private String content;
	private int price;
	
	
	public CarDTO() {

	}

	public CarDTO(String id, String name, String content, int price) {
		this.id = id;
		this.name = name;
		this.content = content;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CarDTO [id=" + id + ", name=" + name + ", content=" + content + ", price=" + price + "]";
	}
	
	
	
	
}
