package com.study.inheritance.prg1;

public abstract class Animal {
	public void bark(Animal a){
		System.out.println(a.getClass().getName()+" Bark");
		System.out.println(a.getClass().getSimpleName()+" Bark");
	}
	public void run(Animal a){
		System.out.println(a.getClass().getName()+" Run");
	}
	abstract void sleep(Animal a);
	
}
