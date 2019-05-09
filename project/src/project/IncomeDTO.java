package project;

public class IncomeDTO {
	private int num;
	private String date;
	private int income;
	private String category;
	private String memo;
	
	
	public IncomeDTO() {

	}


	public IncomeDTO(int num, String date, int income, String category, String memo) {
		this.num = num;
		this.date = date;
		this.income = income;
		this.category = category;
		this.memo = memo;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getIncome() {
		return income;
	}


	public void setIncome(int income) {
		this.income = income;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getMemo() {
		return memo;
	}


	public void setMemo(String memo) {
		this.memo = memo;
	}


	@Override
	public String toString() {
		return "IncomeDTO [num=" + num + ", date=" + date + ", income=" + income + ", category=" + category + ", memo="
				+ memo + "]";
	}
	
	
	
}
