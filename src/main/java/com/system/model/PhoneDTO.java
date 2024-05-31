package com.system.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneDTO {

	@JsonProperty ("number")
	String number;
	
	@JsonProperty ("citycode")
	String cityCode;
	
	@JsonProperty ("countrycode")
	String countryCode;
	
	
}
