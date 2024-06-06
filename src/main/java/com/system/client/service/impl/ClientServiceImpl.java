package com.system.client.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.client.dao.ClientDAO;
import com.system.client.entities.ClientEntity;
import com.system.client.mapper.ClientMapper;
import com.system.client.models.ClientDTO;
import com.system.client.models.OutputDTO;
import com.system.client.service.ClientService;



@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	ClientDAO clientDAO;
	
	
	ClientMapper mapper;
	
	
	@Override
	public OutputDTO create(ClientDTO input) {
		
		ClientEntity client = mapper.convert(input);
		clientDAO.saveClient(client);
		return null;
	}

	@Override
	public OutputDTO update(ClientDTO input) {
		return null;
		
	}

	@Override
	public OutputDTO delete(ClientDTO input) {
		return null;
		
	}

}
