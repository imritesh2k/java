package com.study.collection.usingMaps;

import java.util.HashMap;
import java.util.Map;

class Dog{
	public String name;
	public Dog(String n){
		name = n;
	}
	public boolean equals(Object o){
		if((o instanceof Dog) && ((Dog)o).name == name){
			return true;
		}else{
			return false;
		}
	}
	
	public int hasCode(){
		return name.length();
	}
}

class Cat{
	
}

enum Pets{DOG,CAT,HORSE}

public class UsingMaps {
	public static void main(String[] args) {
		Map<Object, Object> m = new HashMap<Object, Object>();
		m.put("k1", new Dog("aiko"));
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "CAT Key");
		Dog d1 = new Dog("clover");
		m.put(d1, "DOG Key");
		m.put(new Cat(), "Cat Key");
		Cat c = new Cat();
		m.put(c, "cat object");
		System.out.println(m);
		System.out.println(m.get("k1"));
		String k2 = "k2";
		System.out.println(m.get(k2));
		Pets p = Pets.CAT;
		System.out.println(m.get(p));
		System.out.println(m.get(d1));
		System.out.println(m.get(new Cat()));
		System.out.println(m.size());
		System.out.println(m.get(c));
	}
}
