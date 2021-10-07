package com.samya.insertInventoryData.responseModel;


public class Product {
	
	
	private Integer productId;
	private String productCode;
	private String productName;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
            return true;
		 if(obj == null || obj.getClass()!= this.getClass())
	            return false;
		Product p = (Product)obj;
		return p.getProductCode().equals(this.getProductCode());
		
	}
	
	@Override
	public int hashCode() {
		return this.getProductCode().hashCode();
	}
	
	

	

	

}
