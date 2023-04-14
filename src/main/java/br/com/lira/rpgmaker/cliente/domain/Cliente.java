package br.com.lira.rpgmaker.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.lira.rpgmaker.cliente.application.api.ClienteRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idCliente;
	@NotBlank
	private String nome;
	@NotBlank
	@Email
	@Column(unique = true)
	private String email;


	private LocalDateTime dataHoraCadastro;

	public Cliente(@Valid ClienteRequest clienteRequest) {
		this.nome = clienteRequest.getNome();
		this.email = clienteRequest.getEmail();
		this.dataHoraCadastro = LocalDateTime.now();
		
	}
}
