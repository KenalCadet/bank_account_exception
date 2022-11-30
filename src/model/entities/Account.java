package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawlimit;
	
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdrawlimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawlimit = withdrawlimit;
	}

	public Integer getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawlimit() {
		return withdrawlimit;
	}

	public void setWithdrawlimit(Double withdrawlimit) {
		this.withdrawlimit = withdrawlimit;
	}
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		
		if( amount > withdrawlimit) {
			throw new DomainException ("The amount exceeds withdraw limit");
		}
		if(amount> balance) {
			throw new DomainException ("Not enough balance");
		}
		balance -= amount;
	}

	@Override
	public String toString() {
		return "New Balance: " + 
	  String.format("%.2f", balance);
	}

}
