package com.xworkz.warriors.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.warriors.dto.WarriorDTO;
@Component
@RequestMapping("/war")
public class WarriorsController {
	public WarriorsController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	@PostMapping
	public String onSend(WarriorDTO dto) {
		System.out.println("Running the onSend...");
		return "Warriors.jsp";
	}
}
