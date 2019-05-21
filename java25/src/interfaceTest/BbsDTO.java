package interfaceTest;

public class BbsDTO {
	
	private String id;
	private String title;
	private String content;
	private String exc;
	
	public BbsDTO() {
	}

	public BbsDTO(String id, String title, String content, String exc) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.exc = exc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getExc() {
		return exc;
	}

	public void setExc(String exc) {
		this.exc = exc;
	}
	
	
	
	
	
	
}
