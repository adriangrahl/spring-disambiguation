This is the second version, here we can see that is possible to solve the ambiguity by just injecting all candidates in a List.

We're now able to run the application. At first the following log will appear:

Criado bean com.degrahl.adrianfoodapi.di.notificacao.NotificadorSMS@1226e0e3 para o notificador de SMS
Criado bean com.degrahl.adrianfoodapi.di.notificacao.NotificationEmail@f7148f9 para o notificador de Email
constructor AtivacaoClienteService, notificadores: [com.degrahl.adrianfoodapi.di.notificacao.NotificadorSMS@1226e0e3, com.degrahl.adrianfoodapi.di.notificacao.NotificationEmail@f7148f9]

Also, we can make a GET request at the URL http://localhost:8080/hello and see:
notificadores [com.degrahl.adrianfoodapi.di.notificacao.NotificadorSMS@1226e0e3, com.degrahl.adrianfoodapi.di.notificacao.NotificationEmail@f7148f9]