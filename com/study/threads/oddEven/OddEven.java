package com.study.threads.oddEven;

public class OddEven {
	public static void main(String[] args) {
		OddEven oe = new OddEven();
		OddPrint o = new OddPrint();
		Thread t1 = new Thread(o);
		t1.start();
		EvenPrint e = new EvenPrint();
		Thread t2 = new Thread(e);
		t2.start();
		oe.m1(o,e);
		
		
		
		/*try {
			synchronized (o) {
				o.wait();
				e.notifyAll();
			} 
			synchronized (e) {
				e.wait();
				o.notifyAll();
			} 
		} catch (Exception e1) {
			e1.printStackTrace();
		}*/

	}
	
	synchronized void m1(OddPrint o, EvenPrint e){
		try {
			o.wait();
			e.wait();
			//o.notify();
			//e.notify();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
}


