package com.samya.insertInventoryData.responseModel.orderdetails;

import java.util.List;

import com.samya.insertInventoryData.responseModel.Branch;



public class SubmitOrderReq {
	
	private List<PurchaseProduct> purchaseProductList;
	public List<PurchaseProduct> getPurchaseProductList() {
		return purchaseProductList;
	}
	public void setPurchaseProductList(List<PurchaseProduct> purchaseProductList) {
		this.purchaseProductList = purchaseProductList;
	}
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Branch getSelectedBranch() {
		return selectedBranch;
	}
	public void setSelectedBranch(Branch selectedBranch) {
		this.selectedBranch = selectedBranch;
	}
	private Integer totalAmount;
	private Branch selectedBranch;

}
