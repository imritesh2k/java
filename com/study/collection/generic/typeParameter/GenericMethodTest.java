package com.study.collection.generic.typeParameter;

import java.util.ArrayList;
import java.util.List;

abstract class Animal{
	abstract void checkup();
}

abstract class AnimalRun{
	abstract void run();
}

class Dog extends Animal{
	Dog(){
		System.out.println("I am a Dog");
	}
	void checkup() {
		System.out.println("Dog Checkup");
	}
}

class Cat extends Animal{
	Cat(){
		System.out.println("I am a Cat");
	}
	void checkup() {
		System.out.println("Cat Checkup");
	}
}

class Tiger extends AnimalRun{
	Tiger() {
		System.out.println("I am a Tiger");
	}
	@Override
	void run() {
		System.out.println("Tiger is Running");
	}
}

public class GenericMethodTest {
	<E> E add(E o){
		return o;
	}
	
	<E> void addList(List<E> list){
		for(E e: list){
			System.out.println("Printing Generic calss object : "+e);
		}
	}
	
	public static void main(String[] args) {
		GenericMethodTest gmt = new GenericMethodTest();
		System.out.println(gmt.add(10));
		System.out.println(gmt.add("Ritesh"));
		List<Animal> a = new ArrayList<Animal>();
		a.add(new Dog());
		a.add(new Cat());
		gmt.addList(a);
		List<AnimalRun> ar = new ArrayList<AnimalRun>();
		ar.add(new Tiger());
		gmt.addList(ar);
	}

}


