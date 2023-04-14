package com.savarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Servizio;
import com.savarino.repo.ServizioDAO;

@Service
public class ServizioServiceImpl implements ServizioService {
	
	@Autowired
	private ServizioDAO dao;
	
	@Override
	public List<Servizio> getServiceList() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void addService(Servizio s) {
		// TODO Auto-generated method stub
		dao.save(s);
	}

}
