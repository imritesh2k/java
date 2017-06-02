package com.study.hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();
			MyCalculator my_calculator = new MyCalculator();
			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyCalculator{
	int power(int n,int p) throws Exception{
		int ans = 0;
		if((n>=0) && (p>=0)){
			ans = (int) Math.pow(n,p);
		}else{
			throw new Exception("n and p should be non-negative");
		}
		return ans;
	}
}
