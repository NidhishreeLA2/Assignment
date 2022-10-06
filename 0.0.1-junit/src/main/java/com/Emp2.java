package com;

public class Emp2 extends Employee implements Runnable{

	@Override
	int empid() {
		// TODO Auto-generated method stub
		return 124;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Hermoine Granger";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	float salary() {
		// TODO Auto-generated method stub
		return 760;
	}

	@Override
	String previouscompany() {
		// TODO Auto-generated method stub
		return "xyz";
	}

	@Override
	int bonus() {
		// TODO Auto-generated method stub
		return 230;
	}

	@Override
	String skills() {
		// TODO Auto-generated method stub
		return "magic,portions,readings";
	}

	@Override
	boolean willingtojoin() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread t2 has started");
	}
		public static void main (String args[]) {
			Emp2 e2 = new Emp2();
			Thread t2 = new Thread(e2);
			t2.start();
			
			
		
		
	}

}
