package br.com.lira.rpgmaker.cliente.application.api;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ClienteRequest {
	@NotBlank
	private String nome;
	@NotBlank
	@Email
	private String email;
	@NotNull
	private LocalDate dataHoraCadastro;
}
