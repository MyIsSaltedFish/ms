package com.qf.miaoshiti;

public class DG {
	static int foo(int n) {
		if(n <= 2) {
			return n;
		}
		return foo(n-1)+foo(n-2);
	}
	public static void main(String[] args) {
		System.out.println(foo(6));
	}
}
