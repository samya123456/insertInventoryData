package com.samya.insertInventoryData.dao.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.samya.insertInventoryData.Jpamodel.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
