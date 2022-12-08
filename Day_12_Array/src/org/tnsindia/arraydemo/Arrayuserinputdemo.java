package org.tnsindia.arraydemo;

import java.util.Scanner;

public class Arrayuserinputdemo {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the size of arrey:  ");
	int size=s.nextInt();
	//array decleration
	int arr[]=new int[size];
	System.out.println("enter the valuein the array :  ");
	
	//entering value
	for (int i=0;i<arr.length;i++) 
	{   
		System.out.println("enter the"+i+"th index");
 	    arr[i]=s.nextInt();
	}
	
	for (int i=0;i<arr.length;i++)
	System.out.println(arr[i]+"");
	s.close();
	}
}
	
	
	
	
	
	
	
	
	


