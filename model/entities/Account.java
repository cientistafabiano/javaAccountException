package model.entities;

import model.exception.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) 
			throws DomainException {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}
	//overload
	public Integer getNumber() {
		return number;
	}
	//constructor
	public void setNumber(Integer number) {
		this.number = number;
	}
	//getters and setters
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}
	//methods
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withDraw(double amount) throws DomainException {
		if (balance < amount) {
			throw new DomainException("O saldo da conta é inferior ao valor para saque");
		}
		if (withDrawLimit < amount) {
			throw new DomainException ("Valor superior ao limite de saque!");
		}
		balance -= amount;
	}

}
