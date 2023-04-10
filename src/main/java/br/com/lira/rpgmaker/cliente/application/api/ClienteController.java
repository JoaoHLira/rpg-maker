package br.com.lira.rpgmaker.cliente.application.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.lira.rpgmaker.cliente.domain.ClienteAPI;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ClienteController implements ClienteAPI {

	@Override
	public ClienteResponse postCliente(@Valid ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCliente");
		log.info("[finaliza] ClienteController - postCliente");
		return null;
	}

}
