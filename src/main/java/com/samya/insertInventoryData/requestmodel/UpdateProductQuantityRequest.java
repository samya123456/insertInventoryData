package com.samya.insertInventoryData.requestmodel;

import com.samya.insertInventoryData.responseModel.ProductCompanyBranch;
import com.samya.insertInventoryData.responseModel.ProductCompany;

public class UpdateProductQuantityRequest {
	private ProductCompanyBranch productBranch;
	private ProductCompany productCompany;
	public ProductCompanyBranch getProductBranch() {
		return productBranch;
	}
	public void setProductBranch(ProductCompanyBranch productBranch) {
		this.productBranch = productBranch;
	}
	public ProductCompany getProductCompany() {
		return productCompany;
	}
	public void setProductCompany(ProductCompany productCompany) {
		this.productCompany = productCompany;
	}

}
