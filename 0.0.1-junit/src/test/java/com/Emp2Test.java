package com;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Emp2Test {
	@Test
	public void check() {
		Emp2 e2 = new Emp2();
		int b = e2.bonus();
		assertEquals(230,b);
		
	}

}
