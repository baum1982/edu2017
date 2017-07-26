package com.tyn.edu;


public class ThreadExInter {

	public static void main(String[] args) {
		
		RunImplEx r = new RunImplEx();
		Thread th1 = new Thread(r, "*");
	
	
		th1.start();
		
		
		try {
			
			
			
			Thread.sleep(10000);	
			
			th1.interrupt();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}



class RunImplEx implements Runnable {
	@Override
	public void run() {
		
		while (true) {
			System.out.println(Thread.currentThread().getName());
			
			
			
			try {
				Thread.sleep(100000000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}