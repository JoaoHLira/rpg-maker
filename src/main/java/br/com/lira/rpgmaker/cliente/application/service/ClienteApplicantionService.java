package br.com.lira.rpgmaker.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.lira.rpgmaker.cliente.application.api.ClienteRequest;
import br.com.lira.rpgmaker.cliente.application.api.ClienteResponse;
import br.com.lira.rpgmaker.cliente.application.repository.ClienteRepository;
import br.com.lira.rpgmaker.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class ClienteApplicantionService implements ClienteService {

	private final ClienteRepository clienteRepository;
	
	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicantion - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicantion - criaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build();
	}
}