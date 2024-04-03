package com.sravan.spring.springcore;

public class Address {
	private String faltNo;
	private String streetName;
	private String city;

	public String getFaltNo() {
		return faltNo;
	}

	public void setFaltNo(String faltNo) {
		this.faltNo = faltNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [faltNo=" + faltNo + ", streetName=" + streetName + ", city=" + city + "]";
	}

}
