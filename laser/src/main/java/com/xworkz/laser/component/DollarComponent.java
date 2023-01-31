package com.xworkz.laser.component;

import org.springframework.stereotype.Component;

@Component
public class DollarComponent {
	public DollarComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
