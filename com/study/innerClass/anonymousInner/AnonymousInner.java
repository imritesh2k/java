package com.study.innerClass.anonymousInner;

public class AnonymousInner {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.i.m1();
		h.aObj.m2();
		h.aObj.m3();
		h.hai.m4();
		h.hai1.m4();
		h.hai1.m5();
	}
}

interface I1{
	void m1();
}
abstract class A1{
	abstract void m2();
	void m3(){
		System.out.println("A1 - m3");
	}
}
class Hai{
	void m4(){
		System.out.println("Hai - m4");
	}
}
class Hai1 extends Hai{
	void m5(){
		System.out.println("Hai1 - m5");
	}
}
class Hello{
	int a = 10;
	I1 i = new I1(){
		@Override
		public void m1() {
			System.out.println("Hello - I1 - m1");
		}
	};
	A1 aObj = new A1(){
		@Override
		void m2() {
			System.out.println("Hello - A1 - m2");
		}
	};
	Hai hai = new Hai(){
		void m4(){
			System.out.println("Hello - Hai - m4");
		}
	};
	Hai1 hai1 = new Hai1(){
		void m4(){
			System.out.println("Hello - Hai1 - m4");
		}
		void m5(){
			System.out.println("Hello - Hai1 - m5");
		}
	};
}

/*
O/P :
Hello - I1 - m1
Hello - A1 - m2
A1 - m3
Hello - Hai - m4
Hello - Hai1 - m4
Hello - Hai1 - m5
*/

