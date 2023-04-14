package br.com.lira.rpgmaker.cliente.domain;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.lira.rpgmaker.cliente.application.api.ClienteListResponse;
import br.com.lira.rpgmaker.cliente.application.api.ClienteRequest;
import br.com.lira.rpgmaker.cliente.application.api.ClienteResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/v1/cliente")
public interface ClienteAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ClienteResponse postNovoCliente(@Valid @RequestBody ClienteRequest clienteRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<ClienteListResponse> getTodosClientes();
}
