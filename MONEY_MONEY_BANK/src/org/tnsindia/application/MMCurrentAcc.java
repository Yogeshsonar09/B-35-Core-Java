package org.tnsindia.application;

import org.tnsindia.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float accBal) {
		
		{
			System.out.println("Account no.is: "+this.getAccNo()+" "+
					"Account name is: "+this.getAccNm()+" "+
					"Balance is: "+this.getAccBal());
		}

		if(accBal>=10000.00f)
		{
			System.out.println("You can withdraw  Money");
		}
		else 
		{
			System.out.println("You can not withdraw Money");
		}
		System.out.println(accBal);
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + "]";
	}
	
}