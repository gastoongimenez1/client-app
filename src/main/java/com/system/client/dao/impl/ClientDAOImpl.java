package com.system.client.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.system.client.dao.ClientDAO;
import com.system.client.entities.ClientEntity;
import com.system.client.models.ClientDTO;



public class ClientDAOImpl implements ClientDAO {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("clients");


	@Override
	public void saveClient(ClientEntity client) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(client);
		em.getTransaction().commit();
		em.close();

	}

	@Override
	public List<ClientDTO> getAllClients() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT c FROM ClientDTO c");
		List<ClientDTO> clients = query.getResultList();
		em.close();
		return clients;
	}

	@Override
	public ClientDTO getClientById(Long id) {
		EntityManager em = emf.createEntityManager();
		ClientDTO client = em.find(ClientDTO.class, id);
		em.close();
		return client;
	}

	@Override
	public void updateClient(ClientDTO client) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(client);
		em.getTransaction().commit();
		em.close();

	}

	@Override
	public void deleteClient(ClientDTO client) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.contains(client) ? client : em.merge(client));
		em.getTransaction().commit();
		em.close();

	}
}
