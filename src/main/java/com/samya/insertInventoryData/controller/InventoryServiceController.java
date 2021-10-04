package com.samya.insertInventoryData.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samya.insertInventoryData.Jpamodel.ProductJpa;
import com.samya.insertInventoryData.dao.ProductDaoJpa;
import com.samya.insertInventoryData.responseModel.Company;
import com.samya.insertInventoryData.responseModel.Product;
import com.samya.insertInventoryData.responseModel.ProductCompany;
import com.samya.insertInventoryData.responseModel.ProductWiseCompanyList;
import com.samya.insertInventoryData.service.ProductCompanyService;
import com.samya.insertInventoryData.service.inteface.IProductCompanyService;

@RestController
@RequestMapping("/Inventory")
@CrossOrigin
public class InventoryServiceController {
	
	
	
	
	@Autowired
	IProductCompanyService productCompanyService;
	
	
	@RequestMapping("/updateQuantity")
	public ProductCompany updateProductCompanyQuantity(@RequestBody ProductCompany productCompany) throws DataAccessException, SQLException {
	
		return productCompanyService.updateProductCompanyQuantity(productCompany);
		
	}
	
	@RequestMapping("/getAllProducts")
	public List<ProductJpa> getAllProducts() {
		return productCompanyService.getAllProducts();
		
		
		
	}
	
	@RequestMapping("/allComapanyOfProduct")
	public List<ProductCompany> getAllComapanyOfProduct(@RequestBody com.samya.insertInventoryData.responseModel.Product product) throws DataAccessException, SQLException {
		return productCompanyService.getAllComapanyOfProduct(product);
		
		
	}
	
	@RequestMapping("/getAllProductsCompanyWise")
	public List<ProductWiseCompanyList> getAllProductsCompanyWise() throws DataAccessException, SQLException {
		return productCompanyService.getAllProductsCompanyWise();
		
		
	}
	
	@RequestMapping("/allCompany")
	public List<Company> getAllCompany() throws DataAccessException, SQLException{
		return productCompanyService.getAllCompany();
		
	}
	
	@RequestMapping("/addProduct")
	public ProductCompany addNewProduct(@RequestBody ProductCompany productCompany) throws DataAccessException, SQLException{
		return productCompanyService.addNewProduct(productCompany);
		
	}

}
