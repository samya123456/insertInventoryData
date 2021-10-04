package com.samya.insertInventoryData.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samya.insertInventoryData.Jpamodel.ProductCompanyDetailsJpa;


public interface ProductCompanyDetailsRepository extends JpaRepository<ProductCompanyDetailsJpa,Integer>{

}
