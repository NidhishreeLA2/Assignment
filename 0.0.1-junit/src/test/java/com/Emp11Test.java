package com;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Emp11Test {
	@Test
	public void check() {
		Emp11 e11 = new Emp11();
		int a = e11.previoussalary();
		assertEquals(90,a);
		}
}
