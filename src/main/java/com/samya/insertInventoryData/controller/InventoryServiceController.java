package com.samya.insertInventoryData.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samya.insertInventoryData.dao.ProductDao;
import com.samya.insertInventoryData.model.Product;

@RestController
@RequestMapping("/Inventory")
@CrossOrigin
public class InventoryServiceController {
	
	
	@Autowired
	ProductDao operationService;
	
	
	@RequestMapping("/insert")
	public String insertInventoryData(@RequestBody Product product) {
		operationService.save(product);
		return "Succes";
		
	}

}
