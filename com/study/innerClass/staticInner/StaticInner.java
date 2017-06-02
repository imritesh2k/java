package com.study.innerClass.staticInner;

public class StaticInner {
	public static void main(String[] args) {
		
		Outter.Inner i1 = new Outter.Inner();
		System.out.println(i1.x);
		System.out.println(Outter.Inner.y);
		Outter.Inner.test();
	}
}

class Outter{
	int a = 10;
	static int b = 20;
	void m1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(Inner.y);
		
	}
	static class Inner{
		int x = 99;
		static int y = 88;
		void show(){
			System.out.println(b);
			System.out.println(x);
			System.out.println(y);
		}
		static void test(){
			System.out.println("Inner Test");
		}
	}
}

