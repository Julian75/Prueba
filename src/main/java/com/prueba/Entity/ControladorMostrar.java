package com.prueba.Entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorMostrar {

	@RequestMapping("/")
	public String home() {
		return "Hola mundo";
	}
	
	@RequestMapping("/Bienvenido")
	public String Bienvenido() {
		return "Hola Bienvenido";
	}
}
