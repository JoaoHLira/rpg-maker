package br.com.lira.rpgmaker.cliente.application.repository;

import java.util.List;

import br.com.lira.rpgmaker.cliente.domain.Cliente;

public interface ClienteRepository {

	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
}
