package com;

public class Emp1 extends Employee implements Runnable{

	@Override
	int empid() {
		// TODO Auto-generated method stub
		return 123;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Harry potter";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	float salary() {
		// TODO Auto-generated method stub
		return 250;
	}

	@Override
	String previouscompany() {
		// TODO Auto-generated method stub
		return "Home";
	}

	@Override
	int bonus() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	String skills() {
		// TODO Auto-generated method stub
		return "Magic";
	}

	@Override
	boolean willingtojoin() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread is running");
		
	}
	
	public static void main(String args[]) {
		Emp1 e = new Emp1();
		Thread t1 = new Thread(e);
		t1.start();
	}

}
