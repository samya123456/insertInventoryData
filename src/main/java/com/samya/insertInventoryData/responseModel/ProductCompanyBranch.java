package com.samya.insertInventoryData.responseModel;

import java.sql.Date;



public class ProductCompanyBranch {
	

	private Integer productCompanyBranchId;
	private Branch branch;
	private ProductCompany productCompany;
	private Integer branchProductCompanyQuantity;
	private Date updateDate;
	
	public Integer getProductCompanyBranchId() {
		return productCompanyBranchId;
	}
	public void setProductCompanyBranchId(Integer productCompanyBranchId) {
		this.productCompanyBranchId = productCompanyBranchId;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public ProductCompany getProductCompany() {
		return productCompany;
	}
	public void setProductCompany(ProductCompany productCompany) {
		this.productCompany = productCompany;
	}
	public Integer getBranchProductCompanyQuantity() {
		return branchProductCompanyQuantity;
	}
	public void setBranchProductCompanyQuantity(Integer branchProductCompanyQuantity) {
		this.branchProductCompanyQuantity = branchProductCompanyQuantity;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	
	
	
	
	
	
	

}
