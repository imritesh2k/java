package com.study.collection.generic.typeParameterT;

import java.util.ArrayList;
import java.util.List;


public class TestRental {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car("Honda");
		
		List<Car> carList = new ArrayList<Car>();
		carList.add(c1);
		carList.add(c2);
		carList.add(c3);
		
		RentalGeneric<Car> carRental = new RentalGeneric<Car>(3, carList);
		System.out.println(carRental);
		Car carToRent = carRental.getRental();
		carRental.returnRental(carToRent);
		//carList.add(new Cat("Fluffy"));
	}
}



