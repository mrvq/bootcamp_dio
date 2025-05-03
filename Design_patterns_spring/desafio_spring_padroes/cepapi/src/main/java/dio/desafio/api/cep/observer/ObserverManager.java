package dio.desafio.api.cep.observer;

import dio.desafio.api.cep.model.CepResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ObserverManager {

    private final List<CepObserver> observadores;

    public ObserverManager(List<CepObserver> observadores) {
        this.observadores = observadores;
    }

    public void notificarTodos(String cep, CepResponse response) {
        for (CepObserver obs : observadores) {
            obs.notificar(cep, response);
        }
    }
}