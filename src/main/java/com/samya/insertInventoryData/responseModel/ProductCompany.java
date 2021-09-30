package com.samya.insertInventoryData.responseModel;


public class ProductCompany {
	
	private Company company;
	private Integer productcompanyQuantity;	
	
	private Product product;
	
	public Integer getProductcompanyQuantity() {
		return productcompanyQuantity;
	}
	public void setProductcompanyQuantity(Integer productcompanyQuantity) {
		this.productcompanyQuantity = productcompanyQuantity;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	

}
