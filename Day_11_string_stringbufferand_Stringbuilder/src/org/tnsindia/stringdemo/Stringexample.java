package org.tnsindia.stringdemo;
//  import java.utiL.Scanner;
public class Stringexample {

	public static void main(String[] args) {
		//string strl
		String strl ="welcome to tnsindia";
		//String strl1 ="welcome to tnsindia";
		
	String name=new String("welcom to b 35");
	String name1=new String("welcom to b 35");
	
	
	System.out.println(strl);		
	System.out.println(name);	
	
	/*Scanner s = new Scanner(System.in);
	System.out.println("Enter the first set name");
	//string strl //
	String strl= s .nextLine();
	String strl1= s .nextLine();
	
	//new keywoed
	System.out.println("Enter the second  set name");
	String str2=new String(s.nextLine());
	String str22=new String(s.nextLine());
	
	System.out.println(strl );		
	System.out.println(str2);
	
	
	System.out.println(strl==strl1 );
	System.out.println(str2==str22);*/;//true
	//System.out.println(strl.concat(null));(we can add null string)
	System.out.println(name==name1);//flase(coz of new word)
	System.out.println(name.equals(name1));//true (coz of equal method it only  cheak contains )

 
	
	
	
	
	
	
	
	}

}
