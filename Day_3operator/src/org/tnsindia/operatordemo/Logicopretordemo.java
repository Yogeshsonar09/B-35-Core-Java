package org.tnsindia.operatordemo;

import java.util.Scanner;


public class Logicopretordemo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of age weight");
		int age=s.nextInt();
		int weight=s.nextInt();
		
		boolean result1=(age>18 && weight>65);
		boolean result2=(4>5 || 20> 10);
		boolean result3= !(age==weight);
		System.out.println("the result is: "+result1);
		System.out.println("the result is: "+result2);
		System.out.println("the result is: "+result3);
		s.close();
	}

}
