package com.xworkz.warriors.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class WarriorDTO {
	private String firstname;
	private String lastname;
	private String email;
	private long mobile;
	private String gender;
	private LocalDate dob;
	private String address;
	private String city;
	private double pin;
	private String state;
	private String qualification;
	private String password;
}
