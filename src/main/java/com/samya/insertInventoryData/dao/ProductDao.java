package com.samya.insertInventoryData.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.samya.insertInventoryData.dao.interfaces.ProductServiceInterface;
import com.samya.insertInventoryData.dao.repository.ProductRepository;
import com.samya.insertInventoryData.model.Product;

@Service
public class ProductDao implements ProductServiceInterface{
	
	 @Autowired
	 private ProductRepository repo;

	@Override
	public Product save(Product product) {
		
		return 	repo.save(product);
		
	}
	
	public List<Product> listAll() {
        return repo.findAll();
    }

}
