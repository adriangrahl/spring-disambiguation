**Changelog**

* other alteratives as comment (7619b)
* fouth selection way - custom annotations using @qualifier (af205)
* third selection way - @qualifier - adds flexibility in comparison with the previous approaches (4c1c2)
* second selection way - @primary annotation - simple but not flexible (007ff)
* fist selecion way - listing all candidates (7aa46)
* First version, showing the ambiguity problem (42888)

As the fourth version, we stop using directly the @Qualifier and create a custom annotation, 
so that we add clarity and easy to maintenance (refacture backed by IDE)  


/*******DEFINING THE CUSTOM ANNOTATION***************
public enum NivelUrgencia {
	NORMAL,
	URGENTE
}

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoDoNotificador {
	
	NivelUrgencia value();

}

/*******CONFIGURING THE CANDIDATES*******************
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

/********USING THE CUSTOM ANNOTATION TO DEFINE WICH IS THE RIGHT BEAN FOR THIS SCENARIO******
@Component
public class AtivacaoClienteService {

	Notificador notificador;

	public AtivacaoClienteService(@TipoDoNotificador(NivelUrgencia.NORMAL) Notificador notificador) {
		System.out.println(String.format("constructor AtivacaoClienteService, notificador: %s", notificador.toString()));
		this.notificador = notificador;
	}

	public Notificador getNotificador() {
		return notificador;
	}
} 



Log of the application bootstrap:

Criado bean com.degrahl.adrianfoodapi.di.notificacao.NotificationEmail@38fdce85 para o notificador de Email
constructor AtivacaoClienteService, notificador: com.degrahl.adrianfoodapi.di.notificacao.NotificationEmail@38fdce85
Criado bean com.degrahl.adrianfoodapi.di.notificacao.NotificadorSMS@536c35d3 para o notificador de SMS

log when called the "hello" endpoint
notificador com.degrahl.adrianfoodapi.di.notificacao.NotificationEmail@38fdce85
