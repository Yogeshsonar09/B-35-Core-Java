package org.tnsindia.thredsdemo;

class MyThread extends Thread
{
public void run()
{
	for(int i=0;i<5;i++)
	{
		try {
			Thread.sleep(2000);
			System.out.println("Squares of the numbers :"+(i*i));
		} catch (InterruptedException e) {
			System.out.println("Exeption Handled");
		} 
	}
}
}
class Anotherthread extends Thread
{
public void run()
{
	for(int i=0;i<5;i++)
	{
		try {
			Thread.sleep(2000);
			System.out.println("Doubles of the numbers :"+(i*2));
		} catch (InterruptedException e) {
			System.out.println("Exeption Handled");
		} 
	}
}

}

//In multithreading concept at the same time both the process execute
//Driver Class
public class MultiThreadingDemo {
public static void main(String[] args) {
	
	MyThread a1=new MyThread();
	Anotherthread a=new Anotherthread();
	//When you call state method then it automatically come on run method
	a.start();
	a1.run();
}
}

