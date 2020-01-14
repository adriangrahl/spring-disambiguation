package com.degrahl.adrianfoodapi.di.services;

import org.springframework.stereotype.Component;

import com.degrahl.adrianfoodapi.di.annotations.NivelUrgencia;
import com.degrahl.adrianfoodapi.di.annotations.TipoDoNotificador;
import com.degrahl.adrianfoodapi.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	//@Autowired
	//Qualifier("normal")
	Notificador notificador;
	
	//List<Notificador> notificadores;

	public AtivacaoClienteService(@TipoDoNotificador(NivelUrgencia.NORMAL) Notificador notificador) {
		System.out.println(String.format("constructor AtivacaoClienteService, notificador: %s", notificador.toString()));
		this.notificador = notificador;
	}

	public Notificador getNotificador() {
		return notificador;
	}
} 