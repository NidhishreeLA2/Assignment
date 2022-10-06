package com;
import java.util.HashSet;
import java.util.Set;


public class setque {
	public int check() {
	
		Set<Integer> se = new HashSet<Integer>();
		se.add(1);
		se.add(2);
		se.add(2);
		se.add(3);
		se.add(4);
		se.add(1);
		se.add(5);
		se.add(4);
		se.add(3);
		se.add(12);
		se.add(5);
		se.add(9);
		se.add(8);
		se.add(8);
		se.add(10);
		se.add(9);
		se.add(11);
		se.add(10);
		se.add(12);
		se.add(11);
		
		
		
		System.out.println(se);
		
		int last = 0;
		for (int s :se) {
			last = s;
		}
		System.out.println(last);
		return last;
		}
}
		
		
			
			
		
		
	


