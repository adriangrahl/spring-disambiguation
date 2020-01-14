package com.degrahl.adrianfoodapi.di.services;

import org.springframework.stereotype.Component;

import com.degrahl.adrianfoodapi.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	Notificador notificador;

	public AtivacaoClienteService(Notificador notificador) {
		System.out.println(String.format("constructor AtivacaoClienteService, notificador: %s", notificador.toString()));
		this.notificador = notificador;
	}

	public Notificador getNotificador() {
		return notificador;
	}
} 