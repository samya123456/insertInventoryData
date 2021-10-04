package com.samya.insertInventoryData.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samya.insertInventoryData.Jpamodel.ProductCompanyJpa;

public interface ProductCompanyRepository  extends JpaRepository<ProductCompanyJpa,Integer>{

}
