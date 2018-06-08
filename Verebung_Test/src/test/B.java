package test;

public class B extends A {
	

	void f() {
		super.f();
		System.out.println("B.f()");
	}
	
	void g(int i) {
		System.out.println("B.g(int)");
	}
	
	void h() {
		System.out.println("B.h()");
		this.g();
	}
	
	
}
