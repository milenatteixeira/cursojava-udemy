package entities;

public class Account {
	private int number;
	private String name;
	private double deposit;
	
	public Account(int number, String name, double deposit) {
		this.number = number;
		this.name = name;
		makeDeposit(deposit);
	}
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getDeposit() {
		return deposit;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void makeDeposit(double deposit) {
		this.deposit += deposit;
	}
	
	public void withdrawDeposit(double deposit) {
		this.deposit -= deposit + 5;
	}
	
	@Override
	public String toString() {
		return "Account "
			 + getNumber()
			 + ", Holder: "
			 + getName()
			 + ", Balance: $ "
			 + String.format("%.2f", getDeposit());
	}
}
