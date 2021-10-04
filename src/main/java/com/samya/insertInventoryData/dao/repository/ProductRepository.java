package com.samya.insertInventoryData.dao.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.samya.insertInventoryData.Jpamodel.ProductJpa;

public interface ProductRepository extends JpaRepository<ProductJpa,Integer> {

}
