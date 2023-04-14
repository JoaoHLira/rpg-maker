package br.com.lira.rpgmaker.cliente.application.service;

import java.util.List;

import br.com.lira.rpgmaker.cliente.application.api.ClienteListResponse;
import br.com.lira.rpgmaker.cliente.application.api.ClienteRequest;
import br.com.lira.rpgmaker.cliente.application.api.ClienteResponse;
import jakarta.validation.Valid;

public interface ClienteService {

	ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();

}
