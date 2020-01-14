As the third version, the @Qualifier allows us to define a name for the bean, so that we can specify which is the right one at different situations

One quirk of this approach is that we can put it as a parameter within the construction of a class. Ex:

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    
    private Company comp;
    
    private Employee(@Qualifier(value="beanId") Company comp) {
        this.comp=comp;
	}
    
    public Company getComp() {
        return comp;
    }
}

Current log of the "hello" endpoint:
notificador com.degrahl.adrianfoodapi.di.notificacao.NotificationEmail@27719952