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
@Table(name = "T_PRODUCT_COMPANY_DETAILS")
@XmlRootElement
public class ProductCompanyDetailsJpa {
	
	@Id
	@Column(name = "product_company_details_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="product_seq")
	@TableGenerator(name="product_seq",table="product_seq" ,initialValue=2200,allocationSize=1000)
	private Integer productCompanyDetailsId;
	@Column(name = "product_company_id")
	private Integer productCompanyId;
	
	public Integer getProductCompanyDetailId() {
		return productCompanyDetailsId;
	}

	public void setProductCompanyDetailId(Integer productCompanyDetailsId) {
		this.productCompanyDetailsId = productCompanyDetailsId;
	}

	public Integer getProductCompanyId() {
		return productCompanyId;
	}

	public void setProductCompanyId(Integer productCompanyId) {
		this.productCompanyId = productCompanyId;
	}

	public Integer getQuantityAffected() {
		return quantityAffected;
	}

	public void setQuantityAffected(Integer quantityAffected) {
		this.quantityAffected = quantityAffected;
	}

	public String getModeOfOpertion() {
		return modeOfOpertion;
	}

	public void setModeOfOpertion(String modeOfOpertion) {
		this.modeOfOpertion = modeOfOpertion;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	@Column(name = "quantity_affected")
	private Integer quantityAffected;
	
	@Column(name = "mode_of_operation")
	private String modeOfOpertion;
	
	@Column(name = "insert_date")
	private Date insertDate;
	

	
	

	
	
	
	
	
	
	

}
