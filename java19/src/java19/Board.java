package java19;

public class Board {
	String Title;
	String contents;
	String user;
	String password;
	
	
	public Board(String title, String contents, String user, String password) {
		Title = title;
		this.contents = contents;
		this.user = user;
		this.password = password;
	}


	@Override
	public String toString() {
		return "Board [Title=" + Title + ", contents= " + contents + ", user=" + user + ", password=" + password + "]\n";
	}

	
	
}
