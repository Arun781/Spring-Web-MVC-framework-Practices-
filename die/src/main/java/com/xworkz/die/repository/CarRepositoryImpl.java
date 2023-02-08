package com.xworkz.die.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.die.dto.CarDTO;
@Repository
public class CarRepositoryImpl implements CarRepository {
	public CarRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean saved(CarDTO repoCar) {
		System.out.println("Running the Saved in CarRepository");
		return false;
	}

}
