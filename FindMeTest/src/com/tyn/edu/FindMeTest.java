package com.tyn.edu;

public class FindMeTest {
	
	public static Integer current_count = new Integer(0);
	
	public static void main(String[] args) {
		int i = 0;
		
		while (i <= 65535) {
			synchronized (current_count) {
				if (current_count < 5000) {
					ClientThread clientThread = new ClientThread();
					clientThread.willScanPort = i;
					clientThread.start();
					current_count++;
					i++;
					System.out.println(i);
				}
			}
			
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
