package com;

public class Emp5 extends Employee implements Runnable{

	@Override
	int empid() {
		// TODO Auto-generated method stub
		return 126;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Dumbledor";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	float salary() {
		// TODO Auto-generated method stub
		return 9000;
	}

	@Override
	String previouscompany() {
		// TODO Auto-generated method stub
		return "ppp magic";
	}

	@Override
	int bonus() {
		// TODO Auto-generated method stub
		return 5000;
	}

	@Override
	String skills() {
		// TODO Auto-generated method stub
		return "magic,telepathy,shapeshifting";
	}

	@Override
	boolean willingtojoin() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread t5 is running");
		
	}
	public static void main(String args[]) {
		Emp5 e5 = new Emp5();
		Thread t5 = new Thread(e5);
		t5.start();
	}

}
