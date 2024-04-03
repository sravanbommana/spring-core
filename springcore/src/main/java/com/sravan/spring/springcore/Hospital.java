package com.sravan.spring.springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hospital {
	private String hospitalName;
	private List<String> departments;
	private Set<String> branches;
	private Map<String, String> appointment;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

	public Set<String> getBranches() {
		return branches;
	}

	public void setBranches(Set<String> branches) {
		this.branches = branches;
	}

	public Map<String, String> getAppointment() {
		return appointment;
	}

	public void setAppointment(Map<String, String> appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", departments=" + departments + ", branches=" + branches
				+ ", appointment=" + appointment + "]";
	}

}
