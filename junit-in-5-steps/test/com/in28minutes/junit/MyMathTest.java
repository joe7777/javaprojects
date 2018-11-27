package com.in28minutes.junit;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MyMathTest {
	
	MyMath myMath = new MyMath();
	
	@Test
	public void sum_with3numbers() {		
		assertEquals(6, myMath.sum(new int [] {1,2,3}));
	}
	
	@Test
	public void sum_with1numbers() {
		assertEquals(7, myMath.sum(new int [] {7}));
	}
}
