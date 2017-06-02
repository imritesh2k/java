package com.study.exception;

public class Exception1 {
	public static void main(String[] args) {
		Exception1 ex = new Exception1(); 
		try {
			ex.m1();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	void m1() throws Throwable{
		try {
			throw new Exception();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
