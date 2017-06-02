package com.study.collection.generic.typeParameterT;

import java.util.List;

public class RentalGeneric<T>{
	private List<T> rentalPool;
	private int maxNum;
	
	public RentalGeneric(int maxNum, List<T> rentalPool){
		this.maxNum = maxNum;
		this.rentalPool = rentalPool;
	}
	
	public T getRental(){
		System.out.println("RentalGeneric : getRental : rentalPool.get(0) :"+rentalPool.get(0));
		return rentalPool.get(0);
	}
	
	public void returnRental(T returnedThing){
		System.out.println("RentalGeneric : returnRental : returnedThing : "+returnedThing);
		rentalPool.add(returnedThing);
	}

	@Override
	public String toString() {
		return "RentalGeneric [rentalPool=" + rentalPool + ", maxNum=" + maxNum
				+ "]";
	}
}