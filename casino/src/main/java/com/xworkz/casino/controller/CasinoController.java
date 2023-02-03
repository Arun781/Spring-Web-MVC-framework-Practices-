package com.xworkz.casino.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.casino.dto.CasinoDTO;

@Component
@RequestMapping("/goa")
public class CasinoController {
	public CasinoController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	@PostMapping
	public String onCasino(CasinoDTO casinoDTO,Model model) {
		System.out.println("Running the onCasino...");
		System.out.println("Dto:-"+casinoDTO);
		model.addAttribute("name", casinoDTO.getName());
		model.addAttribute("cruise", casinoDTO.getCruise());
		model.addAttribute("entryFee", casinoDTO.getEntryFee());
		model.addAttribute("foodFree", casinoDTO.getFoodFree());
		model.addAttribute("freeAlcohol", casinoDTO.getFreeAlcohol());
		return "CasinoSuccess.jsp";
	}

}
