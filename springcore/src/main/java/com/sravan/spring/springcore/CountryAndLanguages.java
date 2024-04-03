package com.sravan.spring.springcore;

import java.util.Properties;

public class CountryAndLanguages {

	private Properties countryAndLanguages;

	public Properties getCountryAndLanguages() {
		return countryAndLanguages;
	}

	public void setCountryAndLanguages(Properties countryAndLanguages) {
		this.countryAndLanguages = countryAndLanguages;
	}

	@Override
	public String toString() {
		return "CountryAndLanguages [countryAndLanguages=" + countryAndLanguages + "]";
	}

}
