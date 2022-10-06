package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmpFETest {
	@Test
	public void check() {
		Employee3 e3 = new Employee3() {
			 public int previoussalary() {return 1200;}
				
		};
		int a = e3.previoussalary();
		assertEquals(1200,a);
		}
}
