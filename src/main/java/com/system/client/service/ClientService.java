package com.system.client.service;

import com.system.client.models.ClientDTO;
import com.system.client.models.OutputDTO;

public interface ClientService {
	
	public OutputDTO create(ClientDTO input);

	public OutputDTO update(ClientDTO input);

	public OutputDTO delete(ClientDTO input);

}
