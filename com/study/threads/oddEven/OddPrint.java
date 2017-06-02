package com.study.threads.oddEven;

public class OddPrint implements Runnable {
	private int n;
	public void run(){
		System.out.println("OddPrint Run");
		for(int i=1;i<=100;i++){
			this.setN(i);
		}
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
}
