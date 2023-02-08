package com.xworkz.die.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.die.dto.CarDTO;
import com.xworkz.die.service.CarService;

@Component
@RequestMapping("/")
public class CarController {
	@Autowired
	private CarService carService;

	public CarController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/cars")
	public String onCar(CarDTO dto, Model model) {
		System.out.println("Running the onCar");
		model.addAttribute("drive", dto);
		boolean saved = this.carService.validateAndSave(dto);
		System.out.println("Saved" + saved);
		return "die";
	}
}
