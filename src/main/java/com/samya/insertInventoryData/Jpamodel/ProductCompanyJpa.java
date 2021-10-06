package com.samya.insertInventoryData.Jpamodel;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.xml.bind.annotation.XmlRootElement;




@Entity
@Table(name = "T_PRODUCT_COMPANY")
@XmlRootElement
public class ProductCompanyJpa {
	
	@Id
	@Column(name = "product_company_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="product_seq")
	@TableGenerator(name="product_seq",table="product_seq" ,initialValue=100000,allocationSize=1)
	private Integer productCompanyId;
	@Column(name = "company_id")
	private Integer companyId;
	@Column(name = "product_company_quantity")
	private Integer productcompanyQuantity;	
	@Column(name = "product_id")
	private Integer productId;
	@Column(name = "insert_date")
	private Date insertDate;
	@Column(name = "update_date")
	private Date updateDate;
	@Column(name = "product_purchase_price")
	private Integer productPurchasePrice;
	@Column(name = "product_sale_min_price")
	private Integer productSaleMinPrice;
	@Column(name = "product_sale_max_price")
	private Integer productSaleMaxPrice;
	@Column(name = "product_sale_currency")
	private String  productSaleCurrecy;
	@Column(name = "product_purchase_currency")
	private String  productPurchaseCurrecy;
	
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
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public Integer getProductcompanyQuantity() {
		return productcompanyQuantity;
	}
	public void setProductcompanyQuantity(Integer productcompanyQuantity) {
		this.productcompanyQuantity = productcompanyQuantity;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
	
	
	
	

}
