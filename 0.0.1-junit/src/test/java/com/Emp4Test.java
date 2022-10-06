package com;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Emp4Test {
	@Test
	public void check() {
		Emp4 e4 = new Emp4();
		assertEquals("Luna Lovegood",e4.name());
	}

}
