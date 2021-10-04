package com.samya.insertInventoryData.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.RequestBody;

import com.samya.insertInventoryData.responseModel.Company;
import com.samya.insertInventoryData.responseModel.Product;
import com.samya.insertInventoryData.responseModel.ProductCompany;

public interface ProductCompanyDaoInterface {
	
	public List<ProductCompany> getAllProductsCompanyWise() throws DataAccessException, SQLException;

	public List<ProductCompany> getAllComapanyOfProduct(Product product) throws DataAccessException, SQLException;
	public List<Company> getAllCompany() throws DataAccessException, SQLException;
	public List<ProductCompany> getProductCompanyIdFromPrdIDnCompID(ProductCompany productCompany) throws DataAccessException, SQLException;
	

}
