package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp8Test {
	@Test
	public void check() {
		Emp8 e8 = new Emp8();
		assertEquals("Multitasking magic",e8.skills());
	}

}
