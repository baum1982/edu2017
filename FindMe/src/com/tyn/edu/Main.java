package com.tyn.edu;

public class Main {

	public static void main(String[] args) {
//		ServerThread serverThread = new ServerThread(10000);
		ServerThread serverThread = new ServerThread(33788);
		serverThread.start();
		
		while (true) {
			try {
				serverThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
