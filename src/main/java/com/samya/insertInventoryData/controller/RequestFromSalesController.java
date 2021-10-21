package com.samya.insertInventoryData.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samya.insertInventoryData.responseModel.ProductCompanyBranch;
import com.samya.insertInventoryData.responseModel.orderdetails.SubmitOrderReq;
import com.samya.insertInventoryData.service.inteface.IOrderService;

@RestController
@RequestMapping("/Inventory/sales")
@CrossOrigin
public class RequestFromSalesController {
	
	
	@Autowired
	IOrderService orderService;
	
	@RequestMapping("/updateQuantityForOrder")
	public List<ProductCompanyBranch> updateProductCompanyAndBranchQuantity(@RequestBody SubmitOrderReq submitOrderReq) throws DataAccessException, SQLException {
		return orderService.updateProductCompanyBranchForOder(submitOrderReq);
		
		
	}
	
	

}
