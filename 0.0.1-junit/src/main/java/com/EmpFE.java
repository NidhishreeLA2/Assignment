package com;

public class EmpFE {
	public static void main(String args[]) {
		 Employee3 e3 = new Employee3() {
		 public int previoussalary() {return 1200;}
		
		};
		Employee2 e2 = new Employee2() {
			 public void address() {System.out.println("1/3 jihu street");}
			
			};
		Employee4 e4 = new Employee4() {
				 public void salaryexpected() {System.out.println(234);}
				
				};
		Employee5 e5 = new Employee5() {
					 public void Location() {System.out.println("peru");}
					
					};
		Employee6 e6 = new Employee6() {
						 public void willingtorelocate() {System.out.println(false);}
						
						};
		Employee7 e7 = new Employee7() {
							 public void noticeperiod() {System.out.println(10);}
							
							};
		Employee8 e8 = new Employee8() {
								 public void Certification() {System.out.println("Deatheater crash course");}
								
								};
		Employee9 e9 = new Employee9() {
									 public void websites() {System.out.println("www.voldemortfollowers.com");}
									
									};
								
		e3.previoussalary();
	 }

}
