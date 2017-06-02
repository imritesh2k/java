package com.study.threads.oddEven;

public class EvenPrint implements Runnable {
	private int n;
	public void run(){
		System.out.println("EvenPrint Run");
		for(int i=1;i<=100;i++){
			setN(i);
		}
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
}
