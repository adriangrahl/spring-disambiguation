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