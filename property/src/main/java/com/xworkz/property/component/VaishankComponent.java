package com.xworkz.property.component;

import org.springframework.stereotype.Component;

@Component
public class VaishankComponent {
public VaishankComponent() {
	System.out.println("Created "+this.getClass().getSimpleName());
}
}
