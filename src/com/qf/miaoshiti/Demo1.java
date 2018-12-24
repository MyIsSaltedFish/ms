package com.qf.miaoshiti;

public class Demo1 {

	static int foo(int n) {
		if (n < 2) {
			return n;
		}
		int a = foo(n - 1);
		int b = foo(n - 2);
		return a + b;
	}

	public static void operator(StringBuffer x, StringBuffer y) {
		x.append(y);
		y = x;
	}

	public static void main(String[] args) {
		// System.out.println(foo(5));
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operator(a,b);
		System.out.println(a+","+b);
	}
}
