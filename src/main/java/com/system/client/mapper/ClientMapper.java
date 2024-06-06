package com.system.client.mapper;

import com.system.client.entities.ClientEntity;
import com.system.client.models.ClientDTO;


public class ClientMapper {

	public ClientEntity convert (ClientDTO input) {
		ClientEntity client = new ClientEntity();
		client.setEmail(input.getEmail());
		client.setName(input.getName());
		client.setPassword(input.getPassword());
		return client;
	}

}
