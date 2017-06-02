package com.study.threads;

public class Test implements Runnable{
	private int x;
	private int y;
	public static void main(String[] args) {
		Test test = new Test();
		(new Thread(test)).start();
		(new Thread(test)).start();
		
	}

	@Override
	public synchronized void run() {
		for(;;){
			x++;
			y++;
			System.out.println(x +" "+y);
		}
		
	}
}
