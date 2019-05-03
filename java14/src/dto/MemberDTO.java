package dto;

public class MemberDTO {
	private String id;  // 외부에서 접근 불가
	private String pw;
	private String name;
	private String tel;
	
	//단축키 : Alt + shift + s + r  : setters/getters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	
	


}
