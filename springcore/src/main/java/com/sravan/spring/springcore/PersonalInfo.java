package com.sravan.spring.springcore;

public class PersonalInfo {
	private String isMarried;
	private String empType;

	public String getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(String isMarried) {
		this.isMarried = isMarried;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	@Override
	public String toString() {
		return "PersonalInfo [isMarried=" + isMarried + ", empType=" + empType + "]";
	}

}
