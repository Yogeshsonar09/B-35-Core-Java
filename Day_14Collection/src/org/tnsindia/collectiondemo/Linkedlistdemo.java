package org.tnsindia.collectiondemo;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
//import java.util.List;

public class Linkedlistdemo {

	public static void main(String[] args) {
		LinkedList<Character> obj= new LinkedList<Character>();
		 obj.add('A');
		 obj.add('B');
		 obj.add('C');
		 obj.add('D');
		 obj.add('E');
		 obj.add('C');
		 obj.add('C');
		 obj.addFirst('z');
		obj.addLast('q');
		 
		 System.out.println("the elemts are"+obj);
		 System.out.println("the elemts are " +obj.size());
			
		 System.out.println("the elemts are " +obj.indexOf('C'));
		 System.out.println("the elemts are " +obj.lastIndexOf('C'));
		 System.out.println("the elemts are " +obj.isEmpty());
		 System.out.println("the elemts are " +obj.get(4));
		 System.out.println("the elemts are " +obj.set(3, 'W'));
	
		
        Collections.sort(obj);
        System.out.println("the elemts are"+obj);
        Collections.reverse(obj);
        System.out.println("the elemts are"+obj);
		
		
		
		
		}

	


	}


