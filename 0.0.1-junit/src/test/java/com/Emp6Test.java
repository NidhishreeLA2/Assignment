package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp6Test {
	@Test
	public void check() {
		Emp6 e6 = new Emp6();
		assertEquals("ppp magic",e6.previouscompany());
	}

}
