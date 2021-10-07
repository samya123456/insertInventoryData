package com.samya.insertInventoryData.requestmodel;

import com.samya.insertInventoryData.responseModel.ProductBranch;
import com.samya.insertInventoryData.responseModel.ProductCompany;

public class UpdateProductQuantityRequest {
	private ProductBranch productBranch;
	private ProductCompany productCompany;
	public ProductBranch getProductBranch() {
		return productBranch;
	}
	public void setProductBranch(ProductBranch productBranch) {
		this.productBranch = productBranch;
	}
	public ProductCompany getProductCompany() {
		return productCompany;
	}
	public void setProductCompany(ProductCompany productCompany) {
		this.productCompany = productCompany;
	}

}
