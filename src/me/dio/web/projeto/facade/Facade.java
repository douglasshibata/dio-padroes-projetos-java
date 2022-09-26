package me.dio.web.projeto.facade;

import subsistema.cep.CepService;
import subsistema.crm.CrmService;

public class Facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = CepService.getInstancia().recuperarCidade(cep);
		String estado = CepService.getInstancia().recuperarEstado(cep);

		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
