package com.system.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.client.models.ClientDTO;
import com.system.client.models.OutputDTO;
import com.system.client.service.ClientService;


@RestController
@RequestMapping("/v1/clientes")
public class ClientController {
	
	@Autowired
    private ClientService clientService;
	
	
	@PostMapping
    public ResponseEntity<OutputDTO> createClient(@RequestBody ClientDTO client) {
        OutputDTO output = clientService.create(client);
        return new ResponseEntity<>(output, HttpStatus.CREATED);
    }

}
