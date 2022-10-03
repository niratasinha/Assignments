package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AutomobileTest {
	@Test
	public void evaluatesExpression() {
		Truck t1 = new Truck();
		Train t2 = new Train();
		int new1 = t1.wheels();
		String new2 = t2.capacity();
		assertEquals(6,new1);
		assertEquals("100-seater",new2);
	}

}
