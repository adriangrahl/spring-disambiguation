package com.degrahl.adrianfoodapi.di.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.degrahl.adrianfoodapi.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	//Autowired
	//Qualifier("normal") - possible approach, without the current constructor
	Notificador notificador;

	public AtivacaoClienteService(@Qualifier("normal") Notificador notificador) {
		System.out.println(String.format("constructor AtivacaoClienteService, notificador: %s", notificador.toString()));
		this.notificador = notificador;
	}

	public Notificador getNotificador() {
		return notificador;
	}
} 