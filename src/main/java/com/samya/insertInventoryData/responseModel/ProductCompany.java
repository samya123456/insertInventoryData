package com.samya.insertInventoryData.responseModel;

import java.sql.Date;

public class ProductCompany {
	private Integer productCompanyId;
	public Integer getProductCompanyId() {
		return productCompanyId;
	}
	public void setProductCompanyId(Integer productCompanyId) {
		this.productCompanyId = productCompanyId;
	}
	private Company company;
	private Integer productcompanyQuantity;	
	private Integer addedQuantity;	
	private Product product;
	private Date insertDate;
	
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Integer getAddedQuantity() {
		return addedQuantity;
	}
	public void setAddedQuantity(Integer addedQuantity) {
		this.addedQuantity = addedQuantity;
	}
	
	
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
