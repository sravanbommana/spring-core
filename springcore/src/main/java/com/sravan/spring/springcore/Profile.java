package com.sravan.spring.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	@Value("Senior Professor")
	private String title;
	@Value("Google")
	private String organization;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	@Override
	public String toString() {
		return "Profile [title=" + title + ", organization=" + organization + "]";
	}

}
