package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.LaptopRepo;
import com.example.demo.model.Laptop;
import com.example.demo.service.LaptopService;

@RestController
public class LaptopController {

	@Autowired
	LaptopRepo laprepo;
	
	@Autowired
	LaptopService ls;
	
	@GetMapping("/findById")
	public Laptop getLaptop()
	{
		Laptop lap=laprepo.findById(121l).get();
		return lap;
	}
	
	@PostMapping("/create")
	public Laptop createLaptop()
	{
		Laptop lap=new Laptop();
		lap.setBrandName("Asus");
		lap.setPrice(34363.783);
		Laptop lap1=laprepo.save(lap);
		return lap1;
	}
	
	@PutMapping("/update")
	public Laptop updatesLap()
	{
		Laptop lap=ls.updateMethod(laprepo.findById(121l).get());
		return lap;
	}
	
//	@DeleteMapping("/delete")
//	public void deleteLap()
//	{
//		laprepo.deleteById(1l);
//	}
}
