package com.samya.insertInventoryData.dao;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samya.insertInventoryData.Jpamodel.ProductCompanyDetailsJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyJpa;
import com.samya.insertInventoryData.Jpamodel.ProductJpa;
import com.samya.insertInventoryData.dao.interfaces.ProductServiceInterfaceJpa;
import com.samya.insertInventoryData.dao.repository.ProductCompanyDetailsRepository;
import com.samya.insertInventoryData.dao.repository.ProductCompanyRepository;
import com.samya.insertInventoryData.dao.repository.ProductRepository;
import com.samya.insertInventoryData.responseModel.ProductCompany;
import com.samya.insertInventoryData.staticbusinessdata.ModeOfOperationsStatus;


@Service
public class ProductDaoJpa implements ProductServiceInterfaceJpa{
	
	 @Autowired
	 private ProductRepository productRepo;
	 
	 
	 @Autowired
	 private ProductCompanyRepository productCompanyrepo;
	 
	 @Autowired
	 private ProductCompanyDetailsRepository productCompanyDetailsrepo;
	 

	@Override
	public ProductJpa save(ProductJpa product) {
		return 	productRepo.save(product);
		
	}
	
	@Override
	public ProductCompanyJpa save(ProductCompanyJpa productCompanyJpa) {
		return 	productCompanyrepo.save(productCompanyJpa);
		
	}
	
	
	@Override
	public ProductCompanyDetailsJpa save(ProductCompanyDetailsJpa productCompanyDetailsJpa) {
		// TODO Auto-generated method stub
		return productCompanyDetailsrepo.save(productCompanyDetailsJpa);
	}
	
	public List<ProductJpa> listAll() {
        return productRepo.findAll();
    }
	
	
public ProductCompany addNewProduct(ProductCompany productCompany) {
		
		
		long now = System.currentTimeMillis();
		java.sql.Date currentSqlDate = new java.sql.Date(now);
		
		
		ProductJpa productJpa = new ProductJpa();
		productJpa.setProductCode(productCompany.getProduct().getProductCode());
		productJpa.setProductName(productCompany.getProduct().getProductName());
		productJpa.setInsertDate(currentSqlDate);
		
		productJpa = productRepo.save(productJpa);
		
		ProductCompanyJpa  productCompanyJpa = new ProductCompanyJpa();
		productCompanyJpa.setCompanyId(productCompany.getCompany().getId());
		productCompanyJpa.setProductId(productJpa.getProductId());
		productCompanyJpa.setProductcompanyQuantity(productCompany.getProductcompanyQuantity());
		productCompanyJpa.setInsertDate(currentSqlDate);
		productCompanyJpa.setUpdateDate(currentSqlDate);
		
		productCompanyJpa=productCompanyrepo.save(productCompanyJpa);
		
		
		ProductCompanyDetailsJpa productCompanyDetailsJpa = new ProductCompanyDetailsJpa();
		productCompanyDetailsJpa.setProductCompanyId(productCompanyJpa.getProductCompanyId());
		productCompanyDetailsJpa.setModeOfOpertion(ModeOfOperationsStatus.NEW_PRODUCT_ADDED);
		productCompanyDetailsJpa.setQuantityAffected(productCompanyJpa.getProductcompanyQuantity());
		productCompanyDetailsJpa.setInsertDate(currentSqlDate);
		
		
		productCompanyDetailsrepo.save(productCompanyDetailsJpa);
		
		return productCompany;
	}


	
	
	
	

}
