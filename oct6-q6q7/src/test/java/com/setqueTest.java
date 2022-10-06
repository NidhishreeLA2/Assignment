package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class setqueTest {
	@Test
	public void check() {
		setque s = new setque();
		int ss = s.check();
		assertEquals(12,ss);
	}

}
