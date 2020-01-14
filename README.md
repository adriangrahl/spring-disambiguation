This is the first version, here when executed the application will show the following error message:

Parameter 0 of constructor in com.degrahl.adrianfoodapi.di.services.AtivacaoClienteService required a single bean, but 2 were found:

This happens because we have 2 candidates to inject the bean Notificador (NotificadorEmail and NotificadorSMS)

In the other branches you will find alternatives as to define the right candidate.