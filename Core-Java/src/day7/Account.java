package day7;

public class Account {

	
	private int accno;
	private String name;
	private double  amount;
	
	// to generate automatic for set and get 
	// source--> generate getter and setter --> select need variables--> generate
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	/*
	void setAccno(int accno) {
		this.accno=accno;
	}
	
	int getAccno() {
		return accno;
	}
	*/
	
	
	
	
	
}
