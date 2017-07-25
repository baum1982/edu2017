package com.tyn.edu;

public class ThreadEx4 {

	public static void main(String[] args) {
		
		long startNano;
		long endNano;
		double elapsedTime;
		
		startNano = System.nanoTime();
		
		for (int i = 0; i < 300; i++) {
			System.out.println("-");
		}
		
		endNano = System.nanoTime();
		
		elapsedTime = (endNano - startNano) / 1000000.0;
		System.out.println("소요시간1 :" + elapsedTime);
		
		
		startNano = System.nanoTime();
		
		for (int i = 0; i < 300; i++) {
			System.out.println("|");
		}
		
		endNano = System.nanoTime();
		
		elapsedTime = (endNano - startNano) / 1000000.0;
		System.out.println("소요시간2 :" + elapsedTime);
		
		
	}
}
