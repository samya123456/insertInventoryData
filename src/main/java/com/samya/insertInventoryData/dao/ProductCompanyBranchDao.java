package com.samya.insertInventoryData.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.samya.insertInventoryData.dao.interfaces.ProductCompanyBranchDaoInterface;
import com.samya.insertInventoryData.responseModel.ProductCompanyBranch;
import com.samya.insertInventoryData.utility.Queries;

public class ProductCompanyBranchDao implements ProductCompanyBranchDaoInterface {
	@Autowired
	 private JdbcTemplate template; 
	@SuppressWarnings("deprecation")
	@Override
	public List<ProductCompanyBranch> getProductCompanyBranchIdFromPrdIDnCompIDnBranchId(ProductCompanyBranch productCompanyBranch)
			throws DataAccessException, SQLException {
				return template.query(Queries.getQuery("SELECT_PRODUCTCOMPANYBRANCH_PRODUCTID_COMPANYID_BRANCHID")
						,new Object[]{	 productCompanyBranch.getProductCompany().getProduct().getProductId()
										,productCompanyBranch.getProductCompany().getCompany().getId()
										,productCompanyBranch.getBranch().getBranchid()
									  },
						new RowMapper<ProductCompanyBranch>(){  
				    @Override  
				    public ProductCompanyBranch mapRow(ResultSet rs, int rownumber) throws SQLException {  
				    	productCompanyBranch.setProductCompanyBranchId(rs.getInt(1));
				    	productCompanyBranch.setBranchProductCompanyQuantity(rs.getInt(1));
			    	return productCompanyBranch;
			    }  
		    });
	}

}
