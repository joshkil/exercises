package com.searattled.exercises;
import static org.junit.Assert.*;

import org.junit.Test;


public class ComputeFibonacciTest {

	@Test
	public void testComputFib() {
		assertEquals("fib: 1", 1, ComputeFibonacci.computeFib(1));
		assertEquals("fib: 5", 5, ComputeFibonacci.computeFib(5));
		assertEquals("fib: 6", 8, ComputeFibonacci.computeFib(6));
		assertEquals("fib: 7", 13, ComputeFibonacci.computeFib(7));
		assertEquals("fib: 50",12586269025L, ComputeFibonacci.computeFib(50));
		
		assertEquals("fib: 1", 1, ComputeFibonacci.computeFib_v2(1));
		assertEquals("fib: 5", 5, ComputeFibonacci.computeFib_v2(5));
		assertEquals("fib: 6", 8, ComputeFibonacci.computeFib_v2(6));
		assertEquals("fib: 7", 13, ComputeFibonacci.computeFib_v2(7));
		assertEquals("fib: 50",12586269025L, ComputeFibonacci.computeFib_v2(50));
	}

}
