package com.samya.insertInventoryData.responseModel;



public class Company {
	private Integer id;
	private String code;
	private String name;
	private String companyAddress;
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	private String insertDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object o) {
		Company c = (Company)o;
		return this.id==c.id;
		
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	

}
