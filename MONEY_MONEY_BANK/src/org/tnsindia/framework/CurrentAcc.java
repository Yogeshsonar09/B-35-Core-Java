package org.tnsindia.framework;

public abstract class CurrentAcc extends BankAcc {

	final private float creditLimit;
	
	public CurrentAcc(int accNo,String accNm,float accBal,float creditLimit)
	{
		super(accNo,accNm,accBal);
		this.creditLimit = creditLimit;
	}
	@Override
	public void withdraw(float accBal)
	{
		System.out.println("Account no.is: "+this.getAccNo()+" "+
				"Account name is: "+this.getAccNm()+" "+
				"Balance is: "+this.getAccBal());
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}


	
	}