package com.mmcoe.bank;

public class Accounts {
	
	private double balance;
	private double overdraft;
	
	public Accounts()
	{
		
	}
	public Accounts(double balance, double overdraft) {
		this.balance = balance;
		this.overdraft = overdraft;
	}
	/*public void deposit(double amount)
	{
	    if(overdraft < 10000)
	    {
	        double overdraftUsed = 10000 - overdraft;

	        if(amount <= overdraftUsed)
	        {
	            overdraft += amount;
	        }
	        else
	        {
	            overdraft = 10000;
	            balance += amount - overdraftUsed;
	        }
	    }
	    else
	    {
	        balance += amount;
	    }
	}
	public void withdraw(double amount)
	{
	    if(balance >= amount)
	    {
	        balance -= amount;
	    }
	    else if(balance + overdraft >= amount)
	    {
	        double remaining = amount - balance;
	        balance = 0;
	        overdraft -= remaining;
	    }
	    else
	    {
	        System.out.println("Insufficient funds");
	    }
	}*/
	
	public void deposit(double amount)
	{
		overdraft+=amount;
		if(overdraft>10000)
		{
			balance=overdraft-10000;
			overdraft=10000;
		}
	}
	public void withdraw(double amount) throws BalanceException
	{
		if(amount<=(balance+overdraft)) {
			balance-=amount;
			
			if(balance<0) {
				overdraft+=balance;
				balance=0;
			}
			
		}else 
			throw new BalanceException("Insufficient balance!!");
	}
	@Override
	public String toString() {
		return "Accounts [balance=" + balance + ", overdraft=" + overdraft + "]";
	}
}
