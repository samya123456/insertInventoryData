package com.samya.insertInventoryData.dao.interfaces;

import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.DataAccessException;
import com.samya.insertInventoryData.responseModel.ProductCompanyBranch;

public interface ProductCompanyBranchDaoInterface {
	
	public List<ProductCompanyBranch> getProductCompanyBranchIdFromPrdIDnCompIDnBranchId(ProductCompanyBranch productCompanyBranch) throws DataAccessException, SQLException;

}
