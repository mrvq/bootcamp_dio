package dio.desafio.api.cep.observer;

import dio.desafio.api.cep.model.CepResponse;

public interface CepObserver {
    void notificar(String cep, CepResponse response);
}