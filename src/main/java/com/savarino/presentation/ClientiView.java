package com.savarino.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientiView {
	@GetMapping("/visualizzaClienti")
	public String showClienti() {
		return "utenti";
	}
	@RequestMapping("/aggiungiCliente")
	public String mostraNuovoServizio() {
	   // il metodo deve restituire il nome della vista che rappresenta la nuova pagina
	   return "aggiungiCliente";
	}
}
