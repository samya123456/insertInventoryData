package com.samya.insertInventoryData.dao.interfaces;

import java.util.List;

import com.samya.insertInventoryData.Jpamodel.BranchJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyBranchDetailsJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyBranchJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyDetailsJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyJpa;
import com.samya.insertInventoryData.Jpamodel.ProductJpa;
import com.samya.insertInventoryData.responseModel.ProductCompany;

public interface ProductServiceInterfaceJpa {
	
	 public ProductJpa save(ProductJpa product);
	 public ProductCompanyJpa save(ProductCompanyJpa productCompanyJpa);
	 public ProductCompanyDetailsJpa save(ProductCompanyDetailsJpa productCompanyDetailsJpa);
	 public ProductCompanyBranchJpa save( ProductCompanyBranchJpa productCompanyBranchJpa);
	 public ProductCompanyBranchDetailsJpa save( ProductCompanyBranchDetailsJpa productCompanyBranchDetailsJpa);
	 public List<BranchJpa> listAllOpenBranch();
	 public List<ProductJpa> listAll();
	 public ProductCompany addNewProduct(ProductCompany productCompany);

}
