package com.study.others;

import java.util.Scanner;

public class StarProblem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input any number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=i;j>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
