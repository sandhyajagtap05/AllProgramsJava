package com.multithreding;

public class MultiThredingUsingInterface implements Runnable{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i am in runnable class");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
