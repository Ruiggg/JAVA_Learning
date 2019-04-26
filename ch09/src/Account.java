import java.util.*;

public class Account {
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private Date dateCreated;
	//constructor
	public Account() {
		this.dateCreated =  new Date();
	}
	public Account(int id,double balance) {
		this.dateCreated =  new Date();
		this.id = id;
		this.balance = balance;
	}
	//methods
	//visitor
	public int getId() {
		return this.id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	//set
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate/12.0;
	}
	public void withDraw(double withDrawMoney) {
		if(balance>=withDrawMoney)
			this.balance -= withDrawMoney;
		else
			System.out.println("You don't have enough money!");
	}
	public void deposit(double money) {
		balance += money;
	}
	//test
	public static void main(String[] args) {
		Account a = new Account(1122,20000);
		a.setAnnualInterestRate(4.5/100);
		a.withDraw(2500);
		a.deposit(3000);
		System.out.println("Balance:             "+(int)(a.balance*100)/100.0);
		System.out.println("MonthlyInterestRate: "+(int)(a.getMonthlyInterestRate()*10000)/100.0+"%");
		System.out.println("StartDate:           "+a.dateCreated.toString());
	}
}