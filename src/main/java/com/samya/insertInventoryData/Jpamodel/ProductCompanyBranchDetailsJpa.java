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
@Table(name = "t_product_company_branch_details")
@XmlRootElement
public class ProductCompanyBranchDetailsJpa {
	
	@Id
	@Column(name = "product_company_branch_details_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="product_seq")
	@TableGenerator(name="product_seq",table="product_seq" ,initialValue=400000,allocationSize=1)
	private Integer productCompanyBranchDetailsId;
	@Column(name = "product_company_branch_id")
	private Integer productCompanyBranchId;
	@Column(name = "quantity_affected")
	private Integer quantityAffected;
	@Column(name = "insert_date")
	private Date insertDate;
	@Column(name = "mode_of_operation")
	private String modeOfOperations;
	
	public String getModeOfOperations() {
		return modeOfOperations;
	}
	public void setModeOfOperations(String modeOfOperations) {
		this.modeOfOperations = modeOfOperations;
	}
	public Integer getProductCompanyBranchDetailsId() {
		return productCompanyBranchDetailsId;
	}
	public void setProductCompanyBranchDetailsId(Integer productCompanyBranchDetailsId) {
		this.productCompanyBranchDetailsId = productCompanyBranchDetailsId;
	}
	public Integer getProductCompanyBranchId() {
		return productCompanyBranchId;
	}
	public void setProductCompanyBranchId(Integer productCompanyBranchId) {
		this.productCompanyBranchId = productCompanyBranchId;
	}
	public Integer getQuantityAffected() {
		return quantityAffected;
	}
	public void setQuantityAffected(Integer quantityAffected) {
		this.quantityAffected = quantityAffected;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

}
