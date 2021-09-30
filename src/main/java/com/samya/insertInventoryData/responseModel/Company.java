package com.samya.insertInventoryData.responseModel;



public class Company {
	private Integer id;
	private String code;
	private String name;
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
