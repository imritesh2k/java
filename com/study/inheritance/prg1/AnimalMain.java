package com.study.inheritance.prg1;

public class AnimalMain {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.bark(a);
		a.run(a);
		a.sleep(a);
		((Cat) a).eat((Cat) a);
		((Cat) a).snoor(a);
	}

}
