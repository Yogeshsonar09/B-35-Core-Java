package org.tnsindia.thredsdemo;

public class SynchronizedMethodDemo {
	
	synchronized void arraysum(int[] arr)
	{
		int sum=0;
		for(int itr:arr)
		{
			System.out.println(Thread.currentThread().getName());
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	

}