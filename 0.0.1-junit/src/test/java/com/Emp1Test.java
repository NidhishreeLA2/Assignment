package com;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Emp1Test {
	
	@Test
	public void check() {
		Emp1 e = new Emp1();
		int b = e.bonus();
		
		assertEquals(10,b);
	}

}
