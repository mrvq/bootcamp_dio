package dio.desafio.api.cep.observer;

import dio.desafio.api.cep.model.CepResponse;
import org.springframework.stereotype.Component;

@Component
public class LoggingObserver implements CepObserver {

    @Override
    public void notificar(String cep, CepResponse response) {
        System.out.println("Consulta realizada para o CEP: " + cep + " -> " + response);
    }
}