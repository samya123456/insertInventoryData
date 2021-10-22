package com.samya.insertInventoryData.responseModel;

import java.sql.Date;

public class ProductCompany {
	private Integer productCompanyId;
	private Company company;
	private Integer productcompanyQuantity;	
	private Integer addedQuantity;	
	private Product product;
	private Date  insertDate;
	private Date  updateDate;
	private Integer productPurchasePrice;
	private Integer productSaleMinPrice;
	private Integer productSaleMaxPrice;
	private String  productSaleCurrecy;
	private String  productPurchaseCurrecy;
	private String modeOfOpertion;
	public String getModeOfOpertion() {
		return modeOfOpertion;
	}
	public void setModeOfOpertion(String modeOfOpertion) {
		this.modeOfOpertion = modeOfOpertion;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Integer getProductPurchasePrice() {
		return productPurchasePrice;
	}
	public void setProductPurchasePrice(Integer productPurchasePrice) {
		this.productPurchasePrice = productPurchasePrice;
	}
	public Integer getProductSaleMinPrice() {
		return productSaleMinPrice;
	}
	public void setProductSaleMinPrice(Integer productSaleMinPrice) {
		this.productSaleMinPrice = productSaleMinPrice;
	}
	public Integer getProductSaleMaxPrice() {
		return productSaleMaxPrice;
	}
	public void setProductSaleMaxPrice(Integer productSaleMaxPrice) {
		this.productSaleMaxPrice = productSaleMaxPrice;
	}
	public String getProductSaleCurrecy() {
		return productSaleCurrecy;
	}
	public void setProductSaleCurrecy(String productSaleCurrecy) {
		this.productSaleCurrecy = productSaleCurrecy;
	}
	public String getProductPurchaseCurrecy() {
		return productPurchaseCurrecy;
	}
	public void setProductPurchaseCurrecy(String productPurchaseCurrecy) {
		this.productPurchaseCurrecy = productPurchaseCurrecy;
	}

	
	
	
	public Integer getProductCompanyId() {
		return productCompanyId;
	}
	public void setProductCompanyId(Integer productCompanyId) {
		this.productCompanyId = productCompanyId;
	}
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
