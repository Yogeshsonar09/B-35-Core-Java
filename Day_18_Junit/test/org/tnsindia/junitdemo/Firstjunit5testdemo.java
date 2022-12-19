package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Firstjunit5testdemo {
//it signifies tht this is test method into which we write code to test 
	@Test
	void print() {
		System.out.println("first junit demo");
		
 	}
  @Test
  @Disabled
  void display()
  {
	  fail("fail tp print");
  }
}
