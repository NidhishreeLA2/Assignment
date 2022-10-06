package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp9Test {
	@Test
	public void check() {
		Emp9 e9 = new Emp9();
		assertEquals("Draco Malfoy",e9.name());
	}
}
