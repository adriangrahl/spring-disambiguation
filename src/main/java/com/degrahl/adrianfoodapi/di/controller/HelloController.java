package com.degrahl.adrianfoodapi.di.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.degrahl.adrianfoodapi.di.notificacao.Notificador;
import com.degrahl.adrianfoodapi.di.services.AtivacaoClienteService;

@Controller
public class HelloController {
	
	@Autowired
	AtivacaoClienteService service;
	
	@GetMapping("hello")
	@ResponseBody
	public String hello() {
		List<Notificador> notificadores = service.getNotificadores();
		
		System.out.println(String.format("notificadores %s",notificadores.toString()));
		return "Hello!";
	}
}