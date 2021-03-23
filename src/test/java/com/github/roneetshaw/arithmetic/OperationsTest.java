package com.github.roneetshaw.arithmetic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OperationsTest {
	
	@Test
	public void testAdd() {
		Integer res= 5;
		assertEquals(Operations.add(2, 3), res);
	}

}
