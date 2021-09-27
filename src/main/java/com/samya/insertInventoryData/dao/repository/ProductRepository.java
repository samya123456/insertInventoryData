package com.samya.insertInventoryData.dao.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.samya.insertInventoryData.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
