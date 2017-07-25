package com.tyn.edu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import javax.swing.plaf.SliderUI;

import com.tyn.edu.util.RandomKeyUtil;


// List get
public class ListRacingEx2 {
	int LOOP_COUNT = 100000;
	
	ArrayList<Integer> arrayList;
	Vector<Integer> vector;
	LinkedList<Integer> linkedList;
	
	public void setUp() {
		arrayList = new ArrayList<>();
		vector = new Vector<>();
		linkedList = new LinkedList<>();
		
		for (int loop = 0; loop < this.LOOP_COUNT; loop++) {
			arrayList.add(loop);
			vector.add(loop);
			linkedList.add(loop);
		}
	}
	
	
	public void getArrayList() {
		for (int loop = 0; loop < this.LOOP_COUNT; loop++) {
			arrayList.get(loop);
		}
	}
	
	public void getVector() {
		for (int loop = 0; loop < this.LOOP_COUNT; loop++) {
			vector.get(loop);
		}
	}
	
	public void getLinkedList() {
		for (int loop = 0; loop < this.LOOP_COUNT; loop++) {
			//linkedList.get(loop);
			linkedList.peek();
			
		}
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ListRacingEx2 racing = new ListRacingEx2();
		racing.setUp();

		long startNano;
		long endNano;
		double elapsedTime;
		
		Runtime rs =  Runtime.getRuntime();
		
		rs.gc();
		startNano = System.nanoTime();
		racing.getArrayList();				
		endNano = System.nanoTime();
		
		elapsedTime = (endNano - startNano) / 1000000.0;
		System.out.println("arrayListTime :" + elapsedTime);
		
		rs.gc();
		startNano = System.nanoTime();
		racing.getVector();		
		endNano = System.nanoTime();
		
		elapsedTime = (endNano - startNano) / 1000000.0;
		System.out.println("VectorTime :" + elapsedTime);

		rs.gc();
		startNano = System.nanoTime();
		racing.getLinkedList();		
		endNano = System.nanoTime();
		
		elapsedTime = (endNano - startNano) / 1000000.0;
		System.out.println("LinkedListTime :" + elapsedTime);
		
	}
}
