package facade;

import subsistema2_cep.CepApi;
import subsistema_crm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        // Chamando o subsistema de CRM
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
