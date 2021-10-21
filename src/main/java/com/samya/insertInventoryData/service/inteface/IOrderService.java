package com.samya.insertInventoryData.service.inteface;

import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.samya.insertInventoryData.responseModel.ProductCompanyBranch;
import com.samya.insertInventoryData.responseModel.orderdetails.SubmitOrderReq;

public interface IOrderService {
	
	public List<ProductCompanyBranch> updateProductCompanyBranchForOder(SubmitOrderReq submitOrderReq) throws DataAccessException, SQLException;

}
