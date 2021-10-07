package com.samya.insertInventoryData.Jpamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "T_BRANCH")
@XmlRootElement
public class BranchJpa {
	
	
	
	@Id
	@Column(name = "branch_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="product_seq")
	@TableGenerator(name="product_seq",table="product_seq" ,initialValue=6,allocationSize=1)
	private Integer branchid;
	@Column(name = "branch_details_id")
	private Integer branchDetailid;
	@Column(name = "branch_name")
	private String branchName;
	@Column(name = "branch_code")
	private String branchCode;
	@Column(name = "branch_adderss")
	private String branchAdderss;
	@Column(name = "branch_status")
	private String branchStatus;
	
	
	
	public Integer getBranchid() {
		return branchid;
	}
	public void setBranchid(Integer branchid) {
		this.branchid = branchid;
	}
	public Integer getBranchDetailid() {
		return branchDetailid;
	}
	public void setBranchDetailid(Integer branchDetailid) {
		this.branchDetailid = branchDetailid;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchAdderss() {
		return branchAdderss;
	}
	public void setBranchAdderss(String branchAdderss) {
		this.branchAdderss = branchAdderss;
	}
	public String getBranchStatus() {
		return branchStatus;
	}
	public void setBranchStatus(String branchStatus) {
		this.branchStatus = branchStatus;
	}

}
