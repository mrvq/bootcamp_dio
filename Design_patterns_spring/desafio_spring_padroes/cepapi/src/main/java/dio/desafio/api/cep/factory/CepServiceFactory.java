package dio.desafio.api.cep.factory;

import dio.desafio.api.cep.bridge.CepService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CepServiceFactory {

    private final ApplicationContext context;

    public CepServiceFactory(ApplicationContext context) {
        this.context = context;
    }

    public CepService getService(String tipo) {
        return (CepService) context.getBean(tipo);
    }
}