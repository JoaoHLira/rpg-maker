package br.com.lira.rpgmaker.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.lira.rpgmaker.cliente.application.repository.ClienteRepository;
import br.com.lira.rpgmaker.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
public class ClienteInfraRepository implements ClienteRepository {

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[incia] ClienteInfraRepository - salva");
		log.info("[finaliza] ClienteInfraRepository - salva");
		return cliente;
	}
}