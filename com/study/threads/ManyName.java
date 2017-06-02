package com.study.threads;

class NameRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=4;i++){
			System.out.println("Thread Name : "+Thread.currentThread().getName());
			try{
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ManyName {
	public static void main(String[] args) {
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr);
		one.setName("ONE");
		Thread two = new Thread(nr);
		two.setName("TWO");
		Thread three = new Thread(nr);
		three.setName("THREE");
		one.start();
		two.start();
		three.start();
	}

}
