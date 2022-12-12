package org.tnsindia.collectiondemo;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		obj.push("Shiwani");
		obj.push("pooja");
		obj.push("yog");
		obj.push("harsh");
		obj.pop();
		obj.remove(0);
		System.out.println(obj);
		
	}

}
