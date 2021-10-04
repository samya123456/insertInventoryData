package com.samya.insertInventoryData.dao.interfaces;

import java.util.List;

import com.samya.insertInventoryData.Jpamodel.ProductCompanyDetailsJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyJpa;
import com.samya.insertInventoryData.Jpamodel.ProductJpa;
import com.samya.insertInventoryData.responseModel.ProductCompany;

public interface ProductServiceInterfaceJpa {
	
	 public ProductJpa save(ProductJpa product);
	 public ProductCompanyJpa save(ProductCompanyJpa productCompanyJpa);
	 public ProductCompanyDetailsJpa save(ProductCompanyDetailsJpa productCompanyDetailsJpa);
	 
	 
	 public List<ProductJpa> listAll();
	 public ProductCompany addNewProduct(ProductCompany productCompany);

}
