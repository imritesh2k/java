package com.study.exception;

public class Exception2 {
	public static void main(String[] args) {
		Exception2 ex = new Exception2();
		System.out.println(ex.m1());
	}
	
	int m1(){
		try{
			return 1;
		}catch(Exception e){
			return 2;
		}finally{
			return 3;
		}
	}

}
