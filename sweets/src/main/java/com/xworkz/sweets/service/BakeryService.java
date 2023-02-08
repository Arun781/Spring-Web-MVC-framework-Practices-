package com.xworkz.sweets.service;

import com.xworkz.sweets.dto.BakeryDTO;


public interface BakeryService {
	boolean validateAndSave(BakeryDTO bakeryDTO);
}
