package com;

public class Emp6 extends Employee implements Runnable{

	@Override
	int empid() {
		// TODO Auto-generated method stub
		return 127;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "severus snape";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	float salary() {
		// TODO Auto-generated method stub
		return 5000;
	}

	@Override
	String previouscompany() {
		// TODO Auto-generated method stub
		return "ppp magic";
	}

	@Override
	int bonus() {
		// TODO Auto-generated method stub
		return 2390;
	}

	@Override
	String skills() {
		// TODO Auto-generated method stub
		return "magical potions,dark arts";
	}

	@Override
	boolean willingtojoin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread t6 is running");
		
	}
	public static void main(String args[]) {
		Emp6 e6 = new Emp6();
		Thread t6 = new Thread(e6);
		t6.start();
	}

}
