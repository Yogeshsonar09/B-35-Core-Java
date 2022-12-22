package org.tnsindia.thredsdemo;


class Parent
{
	public void squarnum() throws InterruptedException
	{
		for (int i=0;i<5;i++)
		{
			Thread.sleep(2000);
			System.out.println("square of the number is"+i*i);		
			}
		
	}
}

class Child
{
	public void doublenum () throws InterruptedException
	{
		for (int i=0;i<5;i++)
		{
			Thread.sleep(2000);
			System.out.println("square of the number is"+i*2);		
			}
	}
}
public class Singlethreaddemo {

	public static void main(String[] args)throws InterruptedException {
		System.out.println("main method");
		Parent p= new Parent();
		Child c = new Child();
		p.squarnum();
		c.doublenum();
		
	}

}
