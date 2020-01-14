package com.degrahl.adrianfoodapi.di.controller;

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
		Notificador notificador = service.getNotificador();
		
		System.out.println(String.format("notificador %s",notificador.toString()));
		return "Hello!";
	}
}