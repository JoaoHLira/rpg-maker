package br.com.lira.rpgmaker.cliente.application.api;

import java.util.List;
import java.util.UUID;

import br.com.lira.rpgmaker.cliente.domain.Cliente;
import lombok.Value;

@Value
public class ClienteListResponse {

	private UUID idCliente;
	private String nome;
	private String email;

	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return null;
	}
}
