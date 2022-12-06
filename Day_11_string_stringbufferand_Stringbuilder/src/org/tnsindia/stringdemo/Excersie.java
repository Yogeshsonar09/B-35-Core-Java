package org.tnsindia.stringdemo;
import java.util.Scanner;

public class Excersie {

	public static void main(String[] args) {
		System.out.println("Enter the name");
		Scanner s = new Scanner(System.in);

		
		String str="Dhoni";
		String a = s.nextLine();
		//System.out.println("Enter the name");	
		
			if (str.equals(a)) {
				System.out.println("Match");
				
		}
		
			else {
				System.out.println("not matching");	
				s.close();
	}

	}
}