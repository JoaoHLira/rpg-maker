package br.com.lira.rpgmaker.cliente.application.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class ClienteRequest {
	@NotBlank
	private String nome;
	@NotBlank
	@Email
	private String email;
}
