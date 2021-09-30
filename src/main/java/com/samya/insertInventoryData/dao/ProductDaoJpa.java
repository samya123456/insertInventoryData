package com.samya.insertInventoryData.dao;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.samya.insertInventoryData.Jpamodel.Product;
import com.samya.insertInventoryData.dao.interfaces.ProductServiceInterfaceJpa;
import com.samya.insertInventoryData.dao.repository.ProductRepository;


@Service
public class ProductDaoJpa implements ProductServiceInterfaceJpa{
	
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
