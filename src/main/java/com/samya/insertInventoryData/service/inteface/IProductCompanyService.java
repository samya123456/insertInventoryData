package com.samya.insertInventoryData.service.inteface;

import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.RequestBody;

import com.samya.insertInventoryData.Jpamodel.BranchJpa;
import com.samya.insertInventoryData.Jpamodel.ProductJpa;
import com.samya.insertInventoryData.responseModel.Company;
import com.samya.insertInventoryData.responseModel.Product;
import com.samya.insertInventoryData.responseModel.ProductCompany;
import com.samya.insertInventoryData.responseModel.ProductCompanyBranch;
import com.samya.insertInventoryData.responseModel.ProductWiseCompanyList;

public interface IProductCompanyService {
	
	public List<ProductWiseCompanyList> getAllProductsCompanyWise() throws DataAccessException, SQLException;
	
	List<ProductCompany> getAllComapanyOfProduct(Product product) throws DataAccessException, SQLException;
	List<Company> getAllCompany() throws DataAccessException, SQLException;
	ProductCompany addNewProduct(ProductCompany productCompany) ;
	List<ProductJpa> getAllProducts();
	public ProductCompanyBranch updateProductCompanyQuantity(ProductCompanyBranch productCompanyBranch) throws DataAccessException, SQLException;
	
	public List<BranchJpa> getAllOpenBranchs();
	
	

}
