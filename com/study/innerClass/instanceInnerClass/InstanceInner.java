package com.study.innerClass.instanceInnerClass;

public class InstanceInner {
	public static void main(String[] args) {
		Outter o = new Outter();
		o.m1();
		Outter.Inner i1 = new Outter().new Inner();
		System.out.println(i1.x);
		i1.show();
		i1.test();
		Outter.Inner i2 = o.new Inner();
		System.out.println(i2.x);
		i2.show();
		i2.test();
		
	}
}
class Outter{
	int a = 10;
	static int b = 20;
	void m1(){
		System.out.println("Outter m1");
		System.out.println(a);
		System.out.println(b);
		Inner i = new Inner();
		System.out.println(i.x);
		i.show();
	}
	class Inner{
		int x = 99;
		void show(){
			System.out.println(a);
			System.out.println(b);
			System.out.println(x);
		}
		void test(){
			System.out.println("Inner - test");
		}
	}
}