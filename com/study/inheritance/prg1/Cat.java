package com.study.inheritance.prg1;

class Cat extends Animal{

	public void eat(Cat a){
		System.out.println("CAT eat");
	}
	
	public void snoor(Animal a){
		System.out.println("CAT Snoor");
	}

	@Override
	void sleep(Animal a) {
		System.out.println("CAT Sleep");
	}
	

}
