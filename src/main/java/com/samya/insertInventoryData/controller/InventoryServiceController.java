package com.samya.insertInventoryData.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samya.insertInventoryData.Jpamodel.Product;
import com.samya.insertInventoryData.dao.ProductDaoJpa;
import com.samya.insertInventoryData.responseModel.ProductCompany;
import com.samya.insertInventoryData.responseModel.ProductWiseCompanyList;
import com.samya.insertInventoryData.service.ProductCompanyService;
import com.samya.insertInventoryData.service.inteface.IProductCompanyService;

@RestController
@RequestMapping("/Inventory")
@CrossOrigin
public class InventoryServiceController {
	
	
	@Autowired
	ProductDaoJpa operationService;
	
	@Autowired
	IProductCompanyService productCompanyService;
	
	
	@RequestMapping("/insert")
	public String insertInventoryData(@RequestBody Product product) {
		operationService.save(product);
		return "Succes";
		
	}
	
	@RequestMapping("/getAllProducts")
	public List<Product> getAllProducts() {
		return operationService.listAll();
		
		
	}
	
	@RequestMapping("/allComapanyOfProduct")
	public List<ProductCompany> getAllComapanyOfProduct(@RequestBody com.samya.insertInventoryData.responseModel.Product product) throws DataAccessException, SQLException {
		return productCompanyService.getAllComapanyOfProduct(product);
		
		
	}
	
	@RequestMapping("/getAllProductsCompanyWise")
	public List<ProductWiseCompanyList> getAllProductsCompanyWise() throws DataAccessException, SQLException {
		return productCompanyService.getAllProductsCompanyWise();
		
		
	}

}
