package com;

public class Emp3 extends Employee implements Runnable{

	@Override
	int empid() {
		// TODO Auto-generated method stub
		return 125;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Ron weasley";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	float salary() {
		// TODO Auto-generated method stub
		return 340;
	}

	@Override
	String previouscompany() {
		// TODO Auto-generated method stub
		return "nyx";
	}

	@Override
	int bonus() {
		// TODO Auto-generated method stub
		return 230;
	}

	@Override
	String skills() {
		// TODO Auto-generated method stub
		return "talking";
	}

	@Override
	boolean willingtojoin() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread t3 has started");
		
	}
	public static void main(String args[]) {
		Emp3 e3 = new Emp3();
		Thread t3 = new Thread(e3);
		t3.start();
	}

}
