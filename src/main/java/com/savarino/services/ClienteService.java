package com.savarino.services;

import java.util.List;

import com.savarino.entities.Cliente;

public interface ClienteService {
	
	List<Cliente>getClientList();
	void addCliente(Cliente c);

}
