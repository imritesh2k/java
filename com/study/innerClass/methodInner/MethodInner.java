package com.study.innerClass.methodInner;

public class MethodInner {
	public static void main(String[] args) {
		Outter o = new Outter();
		o.m1();
	}
}

class Outter{
	int x = 10;
	static int y = 20;
	void m1(){
		int a = 30;
		class Inner{
			int b = 40;
			void m2(){
				System.out.println(x);
				System.out.println(y);
				System.out.println(b);
			}
		}
		Inner i = new Inner();
		i.m2();
	}
}
