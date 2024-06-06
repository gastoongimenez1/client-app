package com.system.client.dao;

import java.util.List;

import com.system.client.entities.ClientEntity;
import com.system.client.models.ClientDTO;



public interface ClientDAO {

    void saveClient(ClientEntity client);

    List<ClientDTO> getAllClients();

    ClientDTO getClientById(Long id);

    void updateClient(ClientDTO client);

    void deleteClient(ClientDTO client);
}


