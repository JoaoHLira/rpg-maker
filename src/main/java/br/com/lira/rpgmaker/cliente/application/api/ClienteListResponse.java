package br.com.lira.rpgmaker.cliente.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.lira.rpgmaker.cliente.domain.Cliente;
import lombok.Value;

@Value
public class ClienteListResponse {

	private UUID idCliente;
	private String nome;
	private String email;

	public ClienteListResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nome = cliente.getNome();
		this.email = cliente.getEmail();
	}

	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return clientes.stream().map(ClienteListResponse::new).collect(Collectors.toList());
	}
}
