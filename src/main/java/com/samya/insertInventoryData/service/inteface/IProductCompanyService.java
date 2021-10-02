package com.samya.insertInventoryData.service.inteface;

import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.samya.insertInventoryData.responseModel.Product;
import com.samya.insertInventoryData.responseModel.ProductCompany;
import com.samya.insertInventoryData.responseModel.ProductWiseCompanyList;

public interface IProductCompanyService {
	
	public List<ProductWiseCompanyList> getAllProductsCompanyWise() throws DataAccessException, SQLException;
	
	List<ProductCompany> getAllComapanyOfProduct(Product product) throws DataAccessException, SQLException;

}
