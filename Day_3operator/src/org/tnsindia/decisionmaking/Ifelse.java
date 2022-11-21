package org.tnsindia.decisionmaking;
import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		int a=s.nextInt();
		if(a>18)
		{
			System.out.println("you can vote");
		}
		else
		{
			System.out.println("you are not eligibal for vote");
		}
		
		s.close();
			

;
	}

}
