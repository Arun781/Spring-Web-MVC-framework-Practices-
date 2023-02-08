package com.xworkz.die.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.die.dto.CarDTO;
import com.xworkz.die.repository.CarRepository;
@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	public CarServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(CarDTO carDTO) {
		System.out.println("Running the validateAndSave in CarService");
		boolean save = this.carRepository.saved(carDTO);
		System.out.println("The data is saved in CarRepo"+save);
		return true;
	}

}
