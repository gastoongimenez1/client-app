package com.system.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneDTO {

	@JsonProperty ("number")
	String number;
	
	@JsonProperty ("citycode")
	String cityCode;
	
	@JsonProperty ("countrycode")
	String countryCode;

	
	
	public PhoneDTO(String number, String cityCode, String countryCode) {
		super();
		this.number = number;
		this.cityCode = cityCode;
		this.countryCode = countryCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	
}
