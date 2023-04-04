package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.LaptopRepo;
import com.example.demo.model.Laptop;

@Service
public class LaptopService {
	
	@Autowired
	LaptopRepo lapRepo;
	
	
	public Laptop updateMethod(Laptop lp)
	{
		if(lapRepo.existsById(lp.getSerialNo()))
		{
			lp.setBrandName("Dell");
			lapRepo.save(lp);
			return lp;
		}
		else {
			return lp;
		}
		
		
	}

}
