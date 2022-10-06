package com;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Emp5Test {
	@Test
	public void check() {
		Emp5 e5 = new Emp5();
		assertEquals(126,e5.empid());
	}

}
