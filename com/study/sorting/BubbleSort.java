package com.study.sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = {54,32,25,18,9};
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<(a.length-i-1);j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println(a);
	}
}
