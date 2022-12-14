package com.magalhaesvinicius.magalhaes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magalhaesvinicius.magalhaes.entities.Sale;
import com.magalhaesvinicius.magalhaes.services.SaleService;

@RestController
@RequestMapping(value= "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public List<Sale> findSales(){
		return service.findSales();
    }
}