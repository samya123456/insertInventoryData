package com.samya.insertInventoryData.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.samya.insertInventoryData.responseModel.Product;
import com.samya.insertInventoryData.dao.interfaces.ProductCompanyDaoInterface;
import com.samya.insertInventoryData.responseModel.Company;
import com.samya.insertInventoryData.responseModel.ProductCompany;
import com.samya.insertInventoryData.utility.Queries;
@Repository
public class ProductCompanyDao implements ProductCompanyDaoInterface{
	@Autowired
	 private JdbcTemplate template; 
	
	public List<ProductCompany> getAllProductsCompanyWise() throws DataAccessException, SQLException{
		
		 return template.query(Queries.getQuery("SELECT_PRODUCT_COMPANY"),new RowMapper<ProductCompany>(){  
			    @Override  
			    public ProductCompany mapRow(ResultSet rs, int rownumber) throws SQLException {  
			    	Product product= new Product();
			    	Company company = new Company();
			    	ProductCompany productCompany=new ProductCompany();
			    	product.setProductId(rs.getInt(1));
			    	product.setProductCode(rs.getString(2));
			    	product.setProductName(rs.getString(3));
			    	company.setId(rs.getInt(4));
			    	company.setCode(rs.getString(5));
			    	company.setName(rs.getString(6));
			    	productCompany.setProductcompanyQuantity(rs.getInt(7));
			    	productCompany.setCompany(company);
			    	productCompany.setProduct(product);
			        return productCompany;  
			    }  
			    });
	}

	@Override
	public List<ProductCompany> getAllComapanyOfProduct(Product product) throws DataAccessException, SQLException {
		return template.query(Queries.getQuery("SELECT_PRODUCTCOMPANY_PRODUCTWISE"),new Object[]{product.getProductCode()},new RowMapper<ProductCompany>(){  
		    @Override  
		    public ProductCompany mapRow(ResultSet rs, int rownumber) throws SQLException {  
		    	Product product= new Product();
		    	Company company = new Company();
		    	ProductCompany productCompany=new ProductCompany();
		    	product.setProductId(rs.getInt(1));
		    	product.setProductCode(rs.getString(2));
		    	product.setProductName(rs.getString(3));
		    	company.setId(rs.getInt(4));
		    	company.setCode(rs.getString(5));
		    	company.setName(rs.getString(6));
		    	productCompany.setProductcompanyQuantity(rs.getInt(7));
		    	productCompany.setCompany(company);
		    	productCompany.setProduct(product);
		        return productCompany;  
		    }  
		    });
	}

}
