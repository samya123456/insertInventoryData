package com.samya.insertInventoryData.dao.interfaces;

import java.util.List;

import com.samya.insertInventoryData.Jpamodel.Product;

public interface ProductServiceInterfaceJpa {
	
	 public Product save(Product product);
	 public List<Product> listAll();

}
