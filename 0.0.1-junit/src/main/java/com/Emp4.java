package com;

public class Emp4 extends Employee implements Runnable{

	@Override
	int empid() {
		// TODO Auto-generated method stub
		return 126;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Luna Lovegood";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	float salary() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	String previouscompany() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int bonus() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	String skills() {
		// TODO Auto-generated method stub
		return "magic vision";
	}

	@Override
	boolean willingtojoin() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread t4 is running");
		
	}
	public static void main(String args[]) {
		Emp4 e4 = new Emp4();
		Thread t4 = new Thread(e4);
		t4.start();
	}
}
