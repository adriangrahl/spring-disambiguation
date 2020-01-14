package com.degrahl.adrianfoodapi.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.degrahl.adrianfoodapi.di.notificacao.NotificadorSMS;
import com.degrahl.adrianfoodapi.di.notificacao.NotificationEmail;

@Configuration
public class NotificadorConfiguration {

	@Bean
	@Primary
	public NotificadorSMS notificadorSMS() {
		NotificadorSMS notificadorSMS = new NotificadorSMS();
		System.out.println(String.format("Criado bean %s para o notificador de SMS", notificadorSMS.toString()));
		return notificadorSMS;
	}
	
	@Bean
	//@Primary or here, depending on which implementation we want to use
	public NotificationEmail notificadorEmail() {
		NotificationEmail notificadorEmail = new NotificationEmail();
		System.out.println(String.format("Criado bean %s para o notificador de Email", notificadorEmail.toString()));
		return notificadorEmail;
	}
}