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
@Table(name = "T_PRODUCT")
@XmlRootElement
public class ProductJpa {
	
	

	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="product_seq")
	@TableGenerator(name="product_seq",table="product_seq" ,initialValue=0,allocationSize=1000)
	private Integer productId;
	@Column(name = "product_code")
	private String productCode;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_company_id")
	private Integer  productCompanyId;
	@Column(name = "product_quantity")
	private Integer productQuantity;
	@Column(name = "insert_date")
	private Date insertDate;
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Integer getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
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
	public Integer getProductCompanyId() {
		return productCompanyId;
	}
	public void setProductCompanyId(Integer productCompanyId) {
		this.productCompanyId = productCompanyId;
	}

	

	

}
