package org.tnsindia.decisionmaking;

import java.util.Scanner;

public class Nestedifelse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age and weight");
		int a=s.nextInt();
		int b =s.nextInt();
		if (a>=18)
		{
			if (b>=60)
			{
				if(b<=110)
				{
					System.out.println("you can donate the blood");
				}
					
					else
					{
						System.out.println("you can note donate the blood");
						s.close();
					}
				}
			}
		}

	}

 
