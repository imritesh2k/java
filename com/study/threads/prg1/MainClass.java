package com.study.threads.prg1;

public class MainClass {
	public static void main(String[] args) {
		CreateThread c = new CreateThread();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
		//c.run();
		t1.run();
		t2.run();

	}

}
