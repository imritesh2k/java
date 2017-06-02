package com.study.threads.prg1;

public class CreateThread implements Runnable {
	
	@Override
	public void run() {
		System.out.println("started running");
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
