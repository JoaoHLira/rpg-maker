package br.com.lira.rpgmaker.cliente.application.service;

import br.com.lira.rpgmaker.cliente.application.api.ClienteRequest;
import br.com.lira.rpgmaker.cliente.application.api.ClienteResponse;
import jakarta.validation.Valid;

public interface ClienteService {

	ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest);

}
