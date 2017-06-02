package com.study.test;

public class Test extends Thread{
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println("C");
			System.out.println("D");
		}
	}
	public static void main(String[] args) {
		Test t2 = new Test();
		t2.start();
	}

}

