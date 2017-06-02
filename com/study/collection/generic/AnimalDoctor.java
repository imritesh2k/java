package com.study.collection.generic;

import java.util.ArrayList;
import java.util.List;

/*abstract class Animal{
	public abstract void checkup();
}*/

class Animal{
	public void checkup(){
		System.out.println("Animal Checkup");
	}
}

class Dog extends Animal{
	@Override
	public void checkup() {
		System.out.println("DOG Checkup");
	}
}

class Cat extends Animal{
	@Override
	public void checkup() {
		System.out.println("CAT Checkup");
	}
}

class Bird extends Animal{
	@Override
	public void checkup() {
		System.out.println("Bird Checkup");
	}
}

public class AnimalDoctor {
	public void checkAnimals(Animal[] animals){
		for(Animal a : animals){
			a.checkup();
		}
	}
	
	public void checkAnimals(List<Animal> animals){
		for(Animal a : animals){
			a.checkup();
		}
	}
	
	/*public void addAnimal(List<Animal> animals){
		System.out.println(animals);
		animals.add(new Dog());
	}*/
	
	/*public void addAnimal(List<? extends Animal> animals){
		System.out.println(animals);
		//animals.add(new Dog());
	}*/
	
	public void addAnimal(List<? super Dog> animals){
		System.out.println(animals);
		animals.add(new Dog());
		//animals.add(new Cat());
		System.out.println(animals);
	}
	
	/*public static void main(String[] args) {
		Dog[] dogs = {new Dog(), new Dog()};
		Cat[] cats = {new Cat(), new Cat(), new Cat()};
		Bird[] birds = {new Bird()};
		AnimalDoctor doc = new AnimalDoctor();
		doc.checkAnimals(dogs);
		doc.checkAnimals(cats);
		doc.checkAnimals(birds);
	}*/
	
	/*public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat());
		cats.add(new Cat());
		cats.add(new Cat());
		List<Bird> birds = new ArrayList<Bird>();
		birds.add(new Bird());
		AnimalDoctor doc = new AnimalDoctor();
		doc.checkAnimals(dogs);
		doc.checkAnimals(cats);
		doc.checkAnimals(birds);
	}*/
	
	/*public static void main(String[] args) {
		Dog[] dogs = {new Dog(), new Dog()};
		Cat[] cats = {new Cat(), new Cat(), new Cat()};
		Bird[] birds = {new Bird()};
		
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Dog());
		AnimalDoctor doc = new AnimalDoctor();
		doc.checkAnimals(dogs);
		doc.checkAnimals(cats);
		doc.checkAnimals(birds);
		doc.checkAnimals(animals);
		doc.addAnimal(animals);
	}*/
	
	/*public static void main(String[] args) {
		List<Dog> animals = new ArrayList<Dog>();
		animals.add(new Dog());
		animals.add(new Dog());
		AnimalDoctor doc = new AnimalDoctor();
		
		doc.addAnimal(animals);
	}*/
	
	public static void main(String[] args) {
		List<Dog> animals = new ArrayList<Dog>();
		animals.add(new Dog());
		animals.add(new Dog());
		
		/*List<Cat> cAnimals = new ArrayList<Cat>();
		cAnimals.add(new Cat());*/
		
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Animal());
		
		AnimalDoctor doc = new AnimalDoctor();
		doc.addAnimal(animals);
		//doc.addAnimal(cAnimals);
		doc.addAnimal(animalList);
		
		
	}
}


