package com;

public class Emp9 extends Employee implements Runnable{

	@Override
	int empid() {
		// TODO Auto-generated method stub
		return 129;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Draco Malfoy";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	float salary() {
		// TODO Auto-generated method stub
		return 900;
	}

	@Override
	String previouscompany() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int bonus() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	String skills() {
		// TODO Auto-generated method stub
		return "no skills";
	}

	@Override
	boolean willingtojoin() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread t9 is running");
		
	}
	public static void main(String args[]) {
		Emp9 e9 = new Emp9();
		
		Thread t9 = new Thread(e9);
		t9.start();
	}

}
