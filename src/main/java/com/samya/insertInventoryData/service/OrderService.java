package com.samya.insertInventoryData.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.samya.insertInventoryData.responseModel.ProductCompanyBranch;
import com.samya.insertInventoryData.responseModel.orderdetails.SubmitOrderReq;
import com.samya.insertInventoryData.service.inteface.IOrderService;
import com.samya.insertInventoryData.service.inteface.IProductCompanyService;


@Service
public class OrderService implements IOrderService{
	
	
	@Autowired
	IProductCompanyService productCompanyService;

	@Override
	public List<ProductCompanyBranch> updateProductCompanyBranchForOder(SubmitOrderReq submitOrderReq) throws DataAccessException, SQLException {
		  ProductCompanyBranch productCompanyBranch;
		  List<ProductCompanyBranch> productCompanyBranchList = new ArrayList<>();
		  
		  for(int i =0;i<submitOrderReq.getPurchaseProductList().size();i++) {
			   productCompanyBranch = new ProductCompanyBranch();
			   productCompanyBranch.setBranch(submitOrderReq.getPurchaseProductList().get(i)
					   .getSelectedBranch());
			   productCompanyBranch.setProductCompany(submitOrderReq.getPurchaseProductList().get(i)
					   .getProductCompany());
			   productCompanyBranchList.add(productCompanyService.updateProductCompanyQuantity(productCompanyBranch));
		  }
		  return productCompanyBranchList;
		
	}

}
