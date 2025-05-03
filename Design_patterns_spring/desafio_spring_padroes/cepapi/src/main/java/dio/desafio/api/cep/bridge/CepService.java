package dio.desafio.api.cep.bridge;

import dio.desafio.api.cep.model.CepResponse;

public interface CepService {
    CepResponse buscarCep(String cep);
}