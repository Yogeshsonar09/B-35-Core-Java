package org.tnsindia.stringdemo;
import java.util.Scanner;
public class Stringmethoddemo {

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter the first input");
	String str1=s.nextLine();
	System.out.println("Enter the second input");
	String str2=s.nextLine();
	
	//adding 2 string
	System.out.println(str1+str2);
	System.out.println(str1.concat(str2));
	
	//to find length
	System.out.println("the length:" +(str1+str2).length()); 	// FINDING LENGTH
	System.out.println("the INDEX:"  +(str1+str2).indexOf("R")); // Finding index
	System.out.println("the chart at :"  +str1.charAt(2));//finding char
	System.out.println(str1.toLowerCase());//LOWER CASE
	System.out.println(str1.toUpperCase());// UPPER CASE
	System.out.println(50+50+"ERROR"+10+20+30);
	s.close();
	
	
	
	}

}
