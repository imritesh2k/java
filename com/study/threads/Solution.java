package com.study.threads;

public class Solution {

	public static void main(String[] args) {
		/*FoodFactory myFoods = new FoodFactory();
		Food food1 = myFoods.getFood("FastFood");
		Food food2 = myFoods.getFood("Fruit");
		System.out.println("My name is : "+food1.getClass().getName());
		System.out.println("My name is : "+food2.getClass().getName());
		System.out.println("Our Superclass is "+food1.getClass().getSuperclass().getName());
		food1.serveFood();
		food2.serveFood();*/

	}

}

class Food{
	String foodName;
	public Food() {}
	Food(String fName){
		this.foodName= fName;
	}
	
	public void serveFood() {
		System.out.println(foodName);
	}
}
class FoodFactory extends Food{
	public FoodFactory() {}
	public String getFood(String s) {
		return super.foodName = s;
	}
	FoodFactory(String fName) {
		super(fName);
	}

	
}
