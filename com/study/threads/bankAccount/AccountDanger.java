package com.study.threads.bankAccount;

public class AccountDanger implements Runnable{
	private Account acc = new Account();
	public static void main(String[] args) {
		AccountDanger a = new AccountDanger();
		Thread one = new Thread(a);
		Thread two = new Thread(a);
		one.setName("Ferd");
		one.start();
		two.setName("Lucy");
		two.start();
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			makeWithdrawal(10);
			if(acc.getBalance()<10){
				System.out.println("Account is overdrawn");
			}
		}
	}
	
	private synchronized void makeWithdrawal(int amt){
		if(acc.getBalance()>=amt){
			System.out.println(Thread.currentThread().getName()+" is going to withdraw");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			acc.withdraw(amt);
			System.out.println(Thread.currentThread().getName()+" completes the withdraw");
		}else{
			System.out.println("Not enough balance for "+Thread.currentThread().getName()+" to withdraw "+acc.getBalance());
		}
	}

}
