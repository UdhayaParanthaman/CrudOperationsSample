package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Laptop;

public interface LaptopRepo extends CrudRepository<Laptop, Long> {
	
	

}