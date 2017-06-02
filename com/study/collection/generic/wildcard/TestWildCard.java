package com.study.collection.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

abstract class Animal{
	public abstract void checkup();
}

class Dog extends Animal{
	@Override
	public void checkup() {
		System.out.println("Dog Checkup");
	}
}

class Bar{
	void doInsert(List<?> list){
		System.out.println(list);
		//list.add(new Dog());
	}
}

public class TestWildCard {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(10);
		myList.add(20);
		myList.add(30);
		Bar bar = new Bar();
		bar.doInsert(myList);
	}

}
