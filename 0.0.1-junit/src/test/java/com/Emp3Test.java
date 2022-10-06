package com;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Emp3Test {
	@Test
	public void check() {
		Emp3 e3 = new Emp3();
		assertEquals(true,e3.willingtojoin());
	}

}
