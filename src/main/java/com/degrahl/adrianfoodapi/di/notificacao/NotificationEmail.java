package com.degrahl.adrianfoodapi.di.notificacao;

//@Component
public class NotificationEmail implements Notificador {

	public void notificar() {
		System.out.println("notificado via email");
	}
}
