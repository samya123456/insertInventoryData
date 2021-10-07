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
@Table(name = "t_product_company_branch")
@XmlRootElement
public class ProductCompanyBranchJpa {

	@Id
	@Column(name = "product_company_branch_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="product_seq")
	@TableGenerator(name="product_seq",table="product_seq" ,initialValue=300000,allocationSize=1)
	private Integer productCompanyBranchId;
	
	@Column(name = "branch_id")
	private Integer branchId;
	@Column(name = "product_id")
	private Integer productId;
	@Column(name = "company_id")
	private Integer companyId;
	@Column(name = "product_company_id")
	private Integer productCompanyId;
	@Column(name = "product_code")
	private String productCode;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "branch_code")
	private String branchCode;
	@Column(name = "company_code")
	private String companyCode;
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "branch_product_company_quantity")
	private Integer branchProductCompanyQuantity;
	@Column(name = "update_date")
	private Date updateDate;
	
	public Integer getProductCompanyBranchId() {
		return productCompanyBranchId;
	}
	public void setProductCompanyBranchId(Integer productCompanyBranchId) {
		this.productCompanyBranchId = productCompanyBranchId;
	}
	public Integer getBranchProductCompanyQuantity() {
		return branchProductCompanyQuantity;
	}
	public void setBranchProductCompanyQuantity(Integer branchProductCompanyQuantity) {
		this.branchProductCompanyQuantity = branchProductCompanyQuantity;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public Integer getProductCompanyId() {
		return productCompanyId;
	}
	public void setProductCompanyId(Integer productCompanyId) {
		this.productCompanyId = productCompanyId;
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
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	
	
	
	
	public Integer getBranchId() {
		return branchId;
	}
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


}
