package com.TDD.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testForResultFiboTermFor_0() {
		Fibonacci fibo = new Fibonacci();
		int fiboValueFor_0 = fibo.getFiboValue(0);
		assertEquals(0, fiboValueFor_0);
	}
	
	@Test
	public void testForResultFiboTermFor_1() {
		Fibonacci fibo = new Fibonacci();
		int fiboValueFor_1 = fibo.getFiboValue(1);
		assertEquals(1, fiboValueFor_1);
	}
	@Test
	public void testForResultFiboTermFor_5() {
		Fibonacci fibo = new Fibonacci();
		int fiboValueFor_5 = fibo.getFiboValue(5);
		assertEquals(5, fiboValueFor_5);
	}
	@Test
	public void testForResultFiboTermFor_10() {
		Fibonacci fibo = new Fibonacci();
		int fiboValueFor_10 = fibo.getFiboValue(10);
		assertEquals(55, fiboValueFor_10);
	}
	@Test
	public void testEvenValueTermUntil_4() {
		Fibonacci fibo = new Fibonacci();
		assertEquals(4, fibo.getEvenTermsFiboValuesSum(4));
	}
	@Test
	public void testEvenValueTermUntil_10() {
		Fibonacci fibo = new Fibonacci();
		assertEquals(88, fibo.getEvenTermsFiboValuesSum(10));
	}
	@Test
	public void testEvenValueTermUntilValueOfTheTerm_33() {
		Fibonacci fibo = new Fibonacci();
		assertEquals(3524577, fibo.getEvenTermsFiboValuesSum(33));
	}
}
