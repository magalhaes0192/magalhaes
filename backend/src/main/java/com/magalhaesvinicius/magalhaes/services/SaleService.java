package com.magalhaesvinicius.magalhaes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magalhaesvinicius.magalhaes.entities.Sale;
import com.magalhaesvinicius.magalhaes.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;

	
	public List<Sale>findSales() {
		return repository.findAll();
		
    }

}	