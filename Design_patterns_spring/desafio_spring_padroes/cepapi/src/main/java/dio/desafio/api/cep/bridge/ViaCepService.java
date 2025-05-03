package dio.desafio.api.cep.bridge;

import dio.desafio.api.cep.model.CepResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component("viacep")
public class ViaCepService implements CepService {

    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public CepResponse buscarCep(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        return restTemplate.getForObject(url, CepResponse.class);
    }
}