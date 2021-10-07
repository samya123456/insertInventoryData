package com.samya.insertInventoryData.responseModel;

import java.sql.Date;



public class ProductBranch {
	

	private Integer productBranchId;
	private Integer branchId;
	private Integer productId;
	private Integer branchProductQuantity;
	private Date updateDate;
	
	
	
	public Integer getProductBranchId() {
		return productBranchId;
	}
	public void setProductBranchId(Integer productBranchId) {
		this.productBranchId = productBranchId;
	}
	public Integer getBranchId() {
		return branchId;
	}
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getBranchProductQuantity() {
		return branchProductQuantity;
	}
	public void setBranchProductQuantity(Integer branchProductQuantity) {
		this.branchProductQuantity = branchProductQuantity;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


}
