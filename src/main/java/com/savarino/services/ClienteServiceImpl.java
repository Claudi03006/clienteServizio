package com.savarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Cliente;
import com.savarino.repo.ClienteDAO;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteDAO dao;
	@Override
	public List<Cliente> getClientList() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void addCliente(Cliente c) {
		// TODO Auto-generated method stub
		dao.save(c);
	}

}
