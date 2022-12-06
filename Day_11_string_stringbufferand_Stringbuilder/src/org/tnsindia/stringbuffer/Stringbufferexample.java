package org.tnsindia.stringbuffer;

public class Stringbufferexample {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("yog sonar");//7
		//capacity return current capacity
		System.out.println(s.capacity());//16
		
		System.out.println (s.capacity()+"hello"); //16+7=25
		System.out.println(s.length());
		System.out.println(s.append(123));
		System.out.println(s.insert(2, "abc"));
		System.out.println(s.append("welcome to tns foundation "))  ;
		System.out.println(s.capacity());
		
		
		 
		}

	

	}


