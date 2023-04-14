package br.com.lira.rpgmaker.cliente.application.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.lira.rpgmaker.cliente.application.service.ClienteService;
import br.com.lira.rpgmaker.cliente.domain.ClienteAPI;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@RestController
@Log4j2
public class ClienteController implements ClienteAPI {
	private final ClienteService clienteService;

	@Override
	public ClienteResponse postNovoCliente(@Valid ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[finaliza] ClienteController - postCliente");
		return clienteCriado;
	}
}
