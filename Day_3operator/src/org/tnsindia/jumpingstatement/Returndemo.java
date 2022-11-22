package org.tnsindia.jumpingstatement;

public class Returndemo {

	
		static int add(int num1,int num2)
		{
			if(num1>num2)
			{
				return  1;
			}
			else
			{
				return 0;
			}
		}
		

		public static void main(String[] args) {
			System.out.println(add(10,12));

	}

}
