package com.savarino.services;

import java.util.List;

import com.savarino.entities.Servizio;

public interface ServizioService {
	
	List<Servizio>getServiceList();
	public void addService(Servizio s);

}
