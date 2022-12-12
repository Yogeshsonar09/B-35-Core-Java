package org.tnsindia.collectiondemo;

import java.util.List;
import java.util.Vector;

public class Vectordemo {

	public static void main(String[] args) {
		List<Integer> v =new	Vector<>();	
		v.add(12);
		v.add(1, 13);
		v.add(14);
		
	System.out.println(""+v);
	
	
	for(Integer itr:v)
	{
		System.out.print(itr+", ");
	}

}

}