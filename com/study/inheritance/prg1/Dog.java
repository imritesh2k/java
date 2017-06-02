package com.study.inheritance.prg1;

public class Dog extends Animal {

	public void eat(Dog a){
		System.out.println("Dog eat");
	}
	public void snoor(Animal a){
		System.out.println("Dog Snoor");
	}

	@Override
	void sleep(Animal a) {
		System.out.println("Dog sleep");
	}

}
