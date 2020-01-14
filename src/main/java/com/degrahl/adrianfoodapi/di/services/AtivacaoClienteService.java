package com.degrahl.adrianfoodapi.di.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.degrahl.adrianfoodapi.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	List<Notificador> notificadores;

	public AtivacaoClienteService(List<Notificador> notificadores) {
		System.out.println(String.format("constructor AtivacaoClienteService, notificadores: %s", notificadores.toString()));
		this.notificadores = notificadores;
	}

	public List<Notificador> getNotificadores() {
		return notificadores;
	}
} 