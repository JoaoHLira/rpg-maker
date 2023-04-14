package br.com.lira.rpgmaker.cliente.application.api;

import java.util.UUID;

import lombok.Value;

@Value
public class ClienteListResponse {

	private UUID idCliente;
	private String nome;
	private String email;
}
