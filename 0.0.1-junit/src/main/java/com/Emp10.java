package com;

public class Emp10 extends Employee implements Runnable{

	@Override
	int empid() {
		// TODO Auto-generated method stub
		return 130;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Voldemort";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 40;
	}

	@Override
	float salary() {
		// TODO Auto-generated method stub
		return 100000;
	}

	@Override
	String previouscompany() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int bonus() {
		// TODO Auto-generated method stub
		return 90000;
	}

	@Override
	String skills() {
		// TODO Auto-generated method stub
		return "dark arts";
	}

	@Override
	boolean willingtojoin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread t10 is running");
		
	}
	public static void main(String args[]) {
		Emp10 e10 = new Emp10();
		
		Thread t10 = new Thread(e10);
		t10.start();
	}

}
