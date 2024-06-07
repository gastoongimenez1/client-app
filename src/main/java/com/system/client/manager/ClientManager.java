package com.system.client.manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.system.client.models.ClientDTO;


public class ClientManager extends Manager<ClientDTO> {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("clients");
	EntityManager em = emf.createEntityManager();
	
	
	@Override
	public void create(ClientDTO input) {
		em.persist(input);
		
	}
	@Override
	public void update(ClientDTO input) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(ClientDTO input) {
		// TODO Auto-generated method stub
		
	}
	


	
}
