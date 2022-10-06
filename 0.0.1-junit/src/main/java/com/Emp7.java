package com;

public class Emp7 extends Employee implements Runnable{

	@Override
	int empid() {
		// TODO Auto-generated method stub
		return 128;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Mcgonegal";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	float salary() {
		// TODO Auto-generated method stub
		return 7680;
	}

	@Override
	String previouscompany() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int bonus() {
		// TODO Auto-generated method stub
		return 8765;
	}

	@Override
	String skills() {
		// TODO Auto-generated method stub
		return "shape shifting";
	}

	@Override
	boolean willingtojoin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread t7 is running");
		
	}
	public static void main(String args[]) {
		Emp7 e7 = new Emp7();
		Thread t7 = new Thread(e7);
		t7.start();
	}

}
