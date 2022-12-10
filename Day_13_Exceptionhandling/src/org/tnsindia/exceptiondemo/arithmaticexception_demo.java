package org.tnsindia.exceptiondemo;
import java.util.Scanner;
public class arithmaticexception_demo {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		int x =10;
		System.out.println("Enter the nuber");
		int y=s.nextInt();
		//try block contain the exceptioncode
		try {
		
		int result=x/y;
		s.close();
				System.out.println("the ans is "+result);
		// catch block handle the exceptioncode 
		}
			catch(ArithmeticException a)
		{
		 System.out.println("Exception handle"+a);
		}
				
			
				
	}
	
	

}
