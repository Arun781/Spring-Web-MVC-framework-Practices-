package com.xworkz.sweets.repo;

import org.springframework.stereotype.Repository;

import com.xworkz.sweets.dto.BakeryDTO;

@Repository
public class BakeryRepositoryImpl implements BakeryRepository {
	public BakeryRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(BakeryDTO repo) {
		System.out.println("Running the save in BakeryRepository");
		return false;
	}

}
