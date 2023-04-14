package com.savarino.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ServizioView {
	@GetMapping("showService")
		public String showService() {
			return "servizi";
		}
	@RequestMapping("/aggiungiServizio")
	public String mostraNuovoServizio() {
	   // il metodo deve restituire il nome della vista che rappresenta la nuova pagina
	   return "aggiungiServizio";
	}

}
