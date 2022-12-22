package org.tnsindia.thredsdemo;

//Runnable Interface-Functional Interface
class Myrunnable implements Runnable
{

	@Override
	public void run() {
		for(int x=1;x<5;x++)
		{
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
}
//Driver Class
public class MultiThreadingExample {

	public static void main(String[] args) {
		Myrunnable t1=new Myrunnable();
		Thread t=new Thread(t1);
		t.setName("Dharmendra-1");
		t.start();
		
		Thread t2=new Thread(t1);
		t2.setName("Pooja-1");
		t2.start();


	}

}