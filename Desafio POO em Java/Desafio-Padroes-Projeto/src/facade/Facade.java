package facade;

import Subsistema1.Service;
import SubSistema2.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        Service.gravarCliente(nome, cep, cidade, estado);
    }
}