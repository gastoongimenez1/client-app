package com.system.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientDTO {

	@JsonProperty ("name")
	String name;
	
	@JsonProperty ("email")
	String email;
	
	@JsonProperty ("password")
	String password;
	
	@JsonProperty ("phones")
	List<PhoneDTO> phones; 
}
