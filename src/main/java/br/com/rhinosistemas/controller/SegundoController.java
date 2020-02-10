package br.com.rhinosistemas.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/SegundoController")
public class SegundoController {
	
	@GetMapping(value = "/primeiroMetodo", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody()
	public String getTextoPrimeiroMetodo() {
		return "Texto primeiro metodo";
	}
	
	@PostMapping(value = "/segundoMetodo", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody()
	public String getTextoSegundoMetodo() {
		return "Texto segundo metodo";
	}
	

}
