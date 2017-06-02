package com.study.threads;

class Counting implements Runnable{
	public void run() {
		for(int i=1;i<=100;i++){
			if(i%10 == 0){
				System.out.println(i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		Counting c = new Counting();
		Thread one = new Thread(c);
		Thread one1 = new Thread(c);
		one.start();
	}
}
