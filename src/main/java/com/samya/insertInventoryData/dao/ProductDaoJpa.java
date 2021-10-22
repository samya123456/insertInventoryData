package com.samya.insertInventoryData.dao;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samya.insertInventoryData.Jpamodel.BranchJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyBranchDetailsJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyBranchJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyDetailsJpa;
import com.samya.insertInventoryData.Jpamodel.ProductCompanyJpa;
import com.samya.insertInventoryData.Jpamodel.ProductJpa;
import com.samya.insertInventoryData.dao.interfaces.ProductCompanyBranchDaoInterface;
import com.samya.insertInventoryData.dao.interfaces.ProductServiceInterfaceJpa;
import com.samya.insertInventoryData.dao.repository.BranchRepo;
import com.samya.insertInventoryData.dao.repository.ProductCompanyBranchDetailsRepository;
import com.samya.insertInventoryData.dao.repository.ProductCompanyBranchRepository;
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
	 private BranchRepo branchRepo;
	 
	 
	 @Autowired
	 private ProductCompanyRepository productCompanyrepo;
	 
	 @Autowired
	 private ProductCompanyDetailsRepository productCompanyDetailsrepo;
	 
	 @Autowired
	 private ProductCompanyBranchRepository productCompanyBranchRepository;
	 
	 @Autowired
	 private ProductCompanyBranchDetailsRepository productCompanyBranchDetailsRepository;
	 

	@Override
	public ProductJpa save(ProductJpa product) {
		return 	productRepo.save(product);
		
	}
	
	@Override
	public ProductCompanyJpa save(ProductCompanyJpa productCompanyJpa) {
		return 	productCompanyrepo.save(productCompanyJpa);
		
	}
	
	
	@Override
	public ProductCompanyBranchJpa save(ProductCompanyBranchJpa productCompanyBranchJpa) {
		// TODO Auto-generated method stub
		return productCompanyBranchRepository.save(productCompanyBranchJpa);
	}

	@Override
	public ProductCompanyBranchDetailsJpa save(ProductCompanyBranchDetailsJpa productCompanyBranchDetailsJpa) {
		// TODO Auto-generated method stub
		return productCompanyBranchDetailsRepository.save(productCompanyBranchDetailsJpa);
	}
	
	
	@Override
	public ProductCompanyDetailsJpa save(ProductCompanyDetailsJpa productCompanyDetailsJpa) {
		// TODO Auto-generated method stub
		return productCompanyDetailsrepo.save(productCompanyDetailsJpa);
	}
	
	public List<ProductJpa> listAll() {
        return productRepo.findAll();
    }
	
	@Override
	public List<BranchJpa> listAllOpenBranch() {
		// TODO Auto-generated method stub
		return branchRepo.findAllBybranchStatus("OPEN");
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
		productCompanyJpa.setProductPurchasePrice(productCompany.getProductPurchasePrice());
		productCompanyJpa.setProductSaleMinPrice(productCompany.getProductSaleMinPrice());
		productCompanyJpa.setProductSaleMaxPrice(productCompany.getProductSaleMaxPrice());
		productCompanyJpa.setProductSaleCurrecy(productCompany.getProductSaleCurrecy());
		productCompanyJpa.setProductPurchaseCurrecy(productCompany.getProductPurchaseCurrecy());
		productCompanyJpa.setInsertDate(currentSqlDate);
		productCompanyJpa.setUpdateDate(currentSqlDate);
		
		
		productCompanyJpa=productCompanyrepo.save(productCompanyJpa);
		
		
		ProductCompanyDetailsJpa productCompanyDetailsJpa = new ProductCompanyDetailsJpa();
		productCompanyDetailsJpa.setProductCompanyId(productCompanyJpa.getProductCompanyId());
		productCompanyDetailsJpa.setModeOfOpertion(productCompany.getModeOfOpertion());
		productCompanyDetailsJpa.setQuantityAffected(productCompanyJpa.getProductcompanyQuantity());
		productCompanyDetailsJpa.setInsertDate(currentSqlDate);
		
		
		productCompanyDetailsrepo.save(productCompanyDetailsJpa);
		
		return productCompany;
	}






	
	
	
	

}
