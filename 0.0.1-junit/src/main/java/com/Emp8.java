package com;

public class Emp8 extends Employee implements Runnable{

	@Override
	int empid() {
		// TODO Auto-generated method stub
		return 129;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "dobby";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 36;
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
		return 0;
	}

	@Override
	String skills() {
		// TODO Auto-generated method stub
		return "Multitasking magic";
	}

	@Override
	boolean willingtojoin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread t8 is running");
		
	}
	public static void main(String args[]) {
		Emp8  e8= new Emp8();
		Thread t8 = new Thread(e8);
		t8.start();
	}

}
