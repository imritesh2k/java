package com.study.collection.generic.typeParameterT;

public class Car {
	public String carName;
	
	Car(){
		System.out.println("Car default constructor");
	}
	Car(String name){
		System.out.println("1 Parameterised constructor "+name);
		this.carName = name;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + "]";
	}
}
