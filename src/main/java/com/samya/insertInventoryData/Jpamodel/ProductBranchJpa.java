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
@Table(name = "T_PRODUCT_BRANCH")
@XmlRootElement
public class ProductBranchJpa {
	
	/**
	 * 
	 */
	@Id
	@Column(name = "product_branch_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="product_seq")
	@TableGenerator(name="product_seq",table="product_seq" ,initialValue=300000,allocationSize=1)
	private Integer productBranchId;
	@Column(name = "branch_id")
	private Integer branchId;
	@Column(name = "product_id")
	private Integer productId;
	@Column(name = "branch_product_quantity")
	private Integer branchProductQuantity;
	@Column(name = "update_date")
	private Date updateDate;
	
	
	
	
	
	public Integer getProductBranchId() {
		return productBranchId;
	}
	public void setProductBranchId(Integer productBranchId) {
		this.productBranchId = productBranchId;
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
	public Integer getBranchProductQuantity() {
		return branchProductQuantity;
	}
	public void setBranchProductQuantity(Integer branchProductQuantity) {
		this.branchProductQuantity = branchProductQuantity;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


}
