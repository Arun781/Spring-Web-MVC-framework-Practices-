package com.xworkz.lonely.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.lonely.dto.LonelyDTO;

@Component
@RequestMapping
public class LonelyComponent {
	public LonelyComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	@PostMapping("/lonely")
	public String onLonely(LonelyDTO dto) {
		System.out.println("Runnig the onLonely");
		System.out.println("Dto is :-" +dto);
		return "index.jsp";
	}
}
