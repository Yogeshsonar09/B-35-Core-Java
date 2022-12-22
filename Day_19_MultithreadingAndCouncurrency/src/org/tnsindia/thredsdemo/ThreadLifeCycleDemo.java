package org.tnsindia.thredsdemo;

class threadA extends Thread
{
	public void run()
	{   int i;
		System.out.println("Thread-A");
		for(i=0;i<5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Exeption Handled");
			} 
		}
		System.out.println("Squares of the numbers :"+(i*i));
	}

		
	
}
class threadB extends Thread
{
	public void run()
	{   
		int i;
		System.out.println("Thread-B");
		for(i=0;i<5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Exeption Handled");
			} 
		}
		System.out.println("Doubles of the numbers :"+(i*2));
	}
}
public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		threadA t1=new threadA();
		threadB t2=new threadB();
		t1.start();
		
		
		//Move Control to another thread using yield method
		t1.yield();
		try {
			t1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		System.out.println("Main Thread is End");
		
		
		
		
		

	}

}