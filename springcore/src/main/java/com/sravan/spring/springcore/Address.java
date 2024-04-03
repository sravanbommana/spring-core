package com.sravan.spring.springcore;

public class Address {
	private String flatNo;
	private String streetName;
	private String city;

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
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
		return "Address [flatNo=" + flatNo + ", streetName=" + streetName + ", city=" + city + "]";
	}

}
