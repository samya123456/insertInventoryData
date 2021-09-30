package com.samya.insertInventoryData.responseModel;

import java.util.List;

public class ProductWiseCompanyList {
	
	private Product product;
	private List<ProductCompany> productCompanyList;
	public List<ProductCompany> getProductCompanyList() {
		return productCompanyList;
	}
	public void setProductCompanyList(List<ProductCompany> productCompanyList) {
		this.productCompanyList = productCompanyList;
	}
	private Integer totalQuantity;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

}
