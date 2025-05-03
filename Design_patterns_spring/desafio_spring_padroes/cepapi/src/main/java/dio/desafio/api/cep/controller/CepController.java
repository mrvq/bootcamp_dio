package dio.desafio.api.cep.controller;

import dio.desafio.api.cep.bridge.CepService;
import dio.desafio.api.cep.factory.CepServiceFactory;
import dio.desafio.api.cep.model.CepResponse;
import dio.desafio.api.cep.observer.ObserverManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cep")
public class CepController {

    private final CepServiceFactory factory;
    private final ObserverManager observerManager;

    public CepController(CepServiceFactory factory, ObserverManager observerManager) {
        this.factory = factory;
        this.observerManager = observerManager;
    }

    @GetMapping("/{cep}")
    public ResponseEntity<CepResponse> buscarCep(@PathVariable String cep,
            @RequestParam(defaultValue = "viacep") String origem) {
        CepService service = factory.getService(origem);
        CepResponse response = service.buscarCep(cep);
        observerManager.notificarTodos(cep, response);
        return ResponseEntity.ok(response);
    }
}