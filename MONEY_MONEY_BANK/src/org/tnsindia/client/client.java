package org.tnsindia.client;

import org.tnsindia.application.MMBankFactory;
import org.tnsindia.application.MMCurrentAcc;
import org.tnsindia.application.MMSavingAcc;
import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAcc;
import org.tnsindia.framework.SavingAcc;

class client{
	public static void main(String args[])
	{
	
		BankFactory b =new MMBankFactory();
		SavingAcc s= new MMSavingAcc(75863456,"yogesh sonar", 70000, true);
		CurrentAcc c = new MMCurrentAcc(856936547,"harshal ghuge", 20000,30000);
		
		System.out.println("Saving Account");
		s.withdraw(s.getAccBal());
		
		System.out.println();
		
		System.out.println("Current Account");
		c.withdraw(c.getAccBal());
		
		System.out.println();
		
	    System.out.println(s);
	    System.out.println(c);
	    
	   
	}  
} 