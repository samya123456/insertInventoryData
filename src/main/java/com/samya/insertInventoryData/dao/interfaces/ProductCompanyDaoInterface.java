package com.samya.insertInventoryData.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.samya.insertInventoryData.responseModel.ProductCompany;

public interface ProductCompanyDaoInterface {
	
	public List<ProductCompany> getAllProductsCompanyWise() throws DataAccessException, SQLException;

}