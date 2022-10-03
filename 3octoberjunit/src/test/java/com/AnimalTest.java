package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void evaluatesExpression() {
		Cat call = new Cat();
		Cat move = new Cat();
		Cat walk = new Cat();
		String new1 = call.move();
		String new2 = move.call();
		String new3 = walk.call("y","s");
		assertEquals("walk",new1);
		assertEquals("meow",new2);
		assertEquals("cat is walking",new3);
	}
}
