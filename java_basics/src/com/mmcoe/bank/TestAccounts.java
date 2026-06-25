package com.mmcoe.bank;

public class TestAccounts {
	public static void main(String[] args)
	{
		Accounts ac=new Accounts(5000,10000);
		System.out.println(ac);
		
		try
		{
			ac.withdraw(50000);
		}
		catch(BalanceException e)
		{
			//System.out.println(e);
			System.out.println(e.getMessage());
		}
	}	
	}		
		/*ac.withdraw(7000);
		System.out.println(ac);
		
		ac.deposit(2000);
		System.out.println(ac);
		ac.deposit(5000);
		System.out.println(ac);
	}*/

