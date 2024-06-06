package com.system.client.models;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientDTO {

	@JsonProperty ("name")
	private String name;
	
	@JsonProperty ("email")
	private String email;
	
	@JsonProperty ("password")
	private String password;
	
	@JsonProperty ("phones")
	private List<PhoneDTO> phones; 
	
	@JsonProperty ("created")
	private Date created;
	
	@JsonProperty ("modified")
	private Date modified;
	
	@JsonProperty ("last_login")
	private Date lastLogin;
	
	@JsonProperty ("token")
	private String token;
	
	@JsonProperty ("is_active")
	private Boolean isActive;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<PhoneDTO> getPhones() {
		return phones;
	}

	public void setPhones(List<PhoneDTO> phones) {
		this.phones = phones;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
