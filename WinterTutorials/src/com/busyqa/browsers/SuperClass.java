package com.busyqa.browsers;

class A {
	public A() {
		System.out.println("Const A");
	}

	public A(int i) {
		System.out.println("Const A INT");
	}

}

class B extends A {

	public B() {
		System.out.println("Const B");
	}

	public B(int i) {
		super(i);
		System.out.println("Const B INT");
	}
}

public class SuperClass {

	public static void main(String[] args) {

		B b = new B(5);

	}

}
