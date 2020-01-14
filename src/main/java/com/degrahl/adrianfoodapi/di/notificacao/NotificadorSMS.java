package com.degrahl.adrianfoodapi.di.notificacao;

//@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar() {
		System.out.println("notificado via SMS");
	}	
}
