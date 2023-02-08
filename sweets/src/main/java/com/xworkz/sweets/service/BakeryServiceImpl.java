package com.xworkz.sweets.service;

import com.xworkz.sweets.repo.BakeryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.sweets.dto.BakeryDTO;

@Service
public class BakeryServiceImpl implements BakeryService {
	@Autowired
	private BakeryRepository bakeryRepository;

	public BakeryServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(BakeryDTO bakeryDTO) {
		System.out.println("Running the validateAndSave...");
		boolean saved = this.bakeryRepository.save(bakeryDTO);
		System.out.println("Saved in repo:-" + saved);
		return false;
	}

}
