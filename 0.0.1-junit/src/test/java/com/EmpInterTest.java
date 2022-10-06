package com;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class EmpInterTest {
	@Test
	public void check() {
		Emp12 e12 = new Emp12();
		int d = e12.previoussalary();
		Emp13 e13 = new Emp13();
		String d1 = e13.address();
		Emp14 e14 = new Emp14();
		int d2 = e14.salaryexpected();
		Emp15 e15 = new Emp15();
		String d3 = e15.Location();
		Emp16 e16 = new Emp16();
		boolean d4 = e16.willingtorelocate();
		Emp17 e17 = new Emp17();
		int d5 = e17.noticeperiod();
		Emp18 e18 = new Emp18();
		String d6 = e18.Certification();
		
		assertEquals(935,d);
		assertEquals("90,coast road",d1);
		assertEquals(10,d2);
		assertEquals("sanfransico",d3);
		assertEquals(true,d4);
		assertEquals(2,d5);
		assertEquals("Magic certification",d6);
		
		}

}
