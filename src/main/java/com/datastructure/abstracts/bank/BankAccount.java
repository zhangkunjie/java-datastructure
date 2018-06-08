package com.datastructure.abstracts.bank;
//�����˻�����
public class BankAccount {
	private double balance; // account balance
	public BankAccount(double openingBalance) // constructor
	{
		balance = openingBalance;
	}
    //��Ǯ����
	public void deposit(double amount) // makes deposit
	{
		balance = balance + amount;
	}
    //ȡǮ����
	public void withdraw(double amount) // makes withdrawal
	{
		balance = balance - amount;
	}
    //��ӡ������
	public void display() // displays balance
	{
		System.out.println("balance=" + balance);
	}
} // end class BankAccount
