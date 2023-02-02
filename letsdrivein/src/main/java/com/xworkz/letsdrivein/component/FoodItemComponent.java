package com.xworkz.letsdrivein.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping
public class FoodItemComponent {
	public FoodItemComponent() {
		System.out.println("Running the FoodItemComponent");
	}

	@PostMapping("/share")
	public String onSend(@RequestParam String foodname, @RequestParam String type, @RequestParam int Quantity,
			@RequestParam double Price) {
		System.out.println("Running the onSend:-");
		System.out.println("foodname:-"+foodname);
		System.out.println("type:-"+type);
		System.out.println("Quantity:-"+Quantity);
		System.out.println("Price:-"+Price);
		return "index.jsp";
	}
}
