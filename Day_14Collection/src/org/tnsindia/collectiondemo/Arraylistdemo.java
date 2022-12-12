package org.tnsindia.collectiondemo;

import java.util.ArrayList;
import java.util.List;
import java.util.List;
@SuppressWarnings("unused")
public class Arraylistdemo {

	public static void main(String[] args) {
	List<Character> obj= new ArrayList<>();
	 obj.add('A');
	 obj.add('B');
	 obj.add('C');
	 obj.add('D');
	 obj.add('E');
	 obj.add('C');
	 obj.add('C');
	 System.out.println("the elemts are"+obj);
	 System.out.println("the elemts are " +obj.size());
		
	 System.out.println("the elemts are " +obj.indexOf('C'));
	 System.out.println("the elemts are " +obj.lastIndexOf('C'));
	 System.out.println("the elemts are " +obj.isEmpty());
	 System.out.println("the elemts are " +obj.get(4));
	 System.out.println("the elemts are " +obj.set(3, 'W'));
	 System.out.println("the elemts are"+obj);

	
	
	
	
	
	
	}

}
