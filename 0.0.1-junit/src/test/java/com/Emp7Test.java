package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp7Test {
	@Test
	public void check() {
		Emp7 e7 = new Emp7();
		assertEquals(8,e7.experience());
	}
}
