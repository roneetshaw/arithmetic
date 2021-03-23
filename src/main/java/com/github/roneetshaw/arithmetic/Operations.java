package com.github.roneetshaw.arithmetic;

public class Operations {
	
	public static Integer add(Integer a, Integer b) {
		return a+b;
	}
	
	public static Integer minus(Integer a, Integer b) {
		return a-b;
	}
	
	public static Integer product(Integer a, Integer b) {
		return a*b;
	}
	
	public static Integer divide(Integer a, Integer b) {
		if(b!=0)
			return a/b;
		return Integer.MIN_VALUE;
	}

}
