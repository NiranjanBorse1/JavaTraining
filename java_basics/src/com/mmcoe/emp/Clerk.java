package com.mmcoe.emp;

public class Clerk extends Employee {
	private double bonus;
	
	public Clerk(double salary,double bonus)
	{
		super(salary);
		this.bonus=bonus;
		
	}
	@Override
	public double getsalary()
	{
		return super.getsalary()+bonus;
	}

}
