package com.degrahl.adrianfoodapi.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.degrahl.adrianfoodapi.di.annotations.NivelUrgencia;
import com.degrahl.adrianfoodapi.di.annotations.TipoDoNotificador;
import com.degrahl.adrianfoodapi.di.notificacao.NotificadorSMS;
import com.degrahl.adrianfoodapi.di.notificacao.NotificationEmail;

@Configuration
public class NotificadorConfiguration {

	@Bean
	@TipoDoNotificador(NivelUrgencia.URGENTE)
	public NotificadorSMS notificadorSMS() {
		NotificadorSMS notificadorSMS = new NotificadorSMS();
		System.out.println(String.format("Criado bean %s para o notificador de SMS", notificadorSMS.toString()));
		return notificadorSMS;
	}
	
	@Bean
	@TipoDoNotificador(NivelUrgencia.NORMAL)
	public NotificationEmail notificadorEmail() {
		NotificationEmail notificadorEmail = new NotificationEmail();
		System.out.println(String.format("Criado bean %s para o notificador de Email", notificadorEmail.toString()));
		return notificadorEmail;
	}
}