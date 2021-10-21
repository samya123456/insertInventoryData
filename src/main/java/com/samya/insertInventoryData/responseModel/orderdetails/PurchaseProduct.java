package com.samya.insertInventoryData.responseModel.orderdetails;

import com.samya.insertInventoryData.responseModel.Branch;
import com.samya.insertInventoryData.responseModel.ProductCompany;

public class PurchaseProduct {
	
	private ProductCompany productCompany;
	private Integer addedQuantity;
	private Integer saleingPrice;
	private Integer addedQuantitytotalAmount;
	private Branch selectedBranch;
	
	public Branch getSelectedBranch() {
		return selectedBranch;
	}
	public void setSelectedBranch(Branch selectedBranch) {
		this.selectedBranch = selectedBranch;
	}
	public ProductCompany getProductCompany() {
		return productCompany;
	}
	public void setProductCompany(ProductCompany productCompany) {
		this.productCompany = productCompany;
	}
	public Integer getAddedQuantity() {
		return addedQuantity;
	}
	public void setAddedQuantity(Integer addedQuantity) {
		this.addedQuantity = addedQuantity;
	}
	public Integer getSaleingPrice() {
		return saleingPrice;
	}
	public void setSaleingPrice(Integer saleingPrice) {
		this.saleingPrice = saleingPrice;
	}
	public Integer getAddedQuantitytotalAmount() {
		return addedQuantitytotalAmount;
	}
	public void setAddedQuantitytotalAmount(Integer addedQuantitytotalAmount) {
		this.addedQuantitytotalAmount = addedQuantitytotalAmount;
	}

}
