package com;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Emp10Test {
	@Test
	public void check() {
		Emp10 e10 = new Emp10();
		String s = e10.skills();
		String s1 = e10.name();
		assertEquals("dark arts",s);
		assertEquals("Voldemort",s1);
		}

}
