package com.xworkz.sweets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.sweets.service.BakeryService;
import com.xworkz.sweets.dto.BakeryDTO;

@Controller
@RequestMapping("/")
public class BakeryController {
	
	private BakeryService BakeryService;
	
	public BakeryController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	@GetMapping("/bakery")
	public String onBakery(BakeryDTO bakeryDTO, Model model) {
		System.out.println("Running the onBakery...");
		model.addAttribute("dtoss", bakeryDTO);
		return "Bakery";
	}
}
