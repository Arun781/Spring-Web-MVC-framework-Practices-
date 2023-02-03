package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dtos.BeachDTO;

@Component
@RequestMapping("/games")
public class GoaController {
public GoaController() {
	System.out.println("Created "+this.getClass().getSimpleName());
}
@PostMapping
public String onGoa(BeachDTO beachDTO,Model model) {
	System.out.println("running the onGoa"+beachDTO);
	
	model.addAttribute("nameOfBeach",beachDTO.getNameOfBeach());
	model.addAttribute("numOfBeachs", beachDTO.getGamesToPlay());
	model.addAttribute("entryfeeOfBeach", beachDTO.getNumOfBeachs());
	model.addAttribute("gamesToPlay", beachDTO.getEntryfeeOfBeach());
	model.addAttribute("clean", beachDTO.getClean());
	return "GoaSuccess.jsp";
}
}
