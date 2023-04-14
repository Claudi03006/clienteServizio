package com.savarino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savarino.entities.Cliente;
import com.savarino.entities.Servizio;
import com.savarino.services.ClienteService;
import com.savarino.services.ServizioService;

@RestController
@RequestMapping("api")
public class RistoranteREST {

	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ServizioService servizioService;
	
	@GetMapping("clienti")
	List<Cliente>getClienti(){
		return clienteService.getClientList();
	}
	@GetMapping("servizi")
	List<Servizio>getServizio(){
		return servizioService.getServiceList();
	}
	@PostMapping(value = "nuoviServizi",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String>addService(@ModelAttribute Servizio s){
		servizioService.addService(s);
		return ResponseEntity.status(HttpStatus.CREATED).body("servizio effetuato con successo");
	}
	@PostMapping(value = "nuoviClienti",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String>addClient(@ModelAttribute Cliente c){
		clienteService.addCliente(c);
		return ResponseEntity.status(HttpStatus.CREATED).body("cliente aggiunto con successo");
	}
	
}
