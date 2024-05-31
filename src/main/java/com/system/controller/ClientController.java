package com.system.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.model.ClientDTO;
import com.system.model.OutputDTO;

@RestController
@RequestMapping("/v1/clientes")
public class ClientController {
	

	   @PostMapping(value = "api/v1/employee/")
	    public OutputDTO postEmployee(ClientDTO input){
		   return null;
	    }

}
