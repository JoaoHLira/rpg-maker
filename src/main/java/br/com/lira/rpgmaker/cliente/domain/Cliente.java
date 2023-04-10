package br.com.lira.rpgmaker.cliente.domain;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
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
	private String email;
	@NotNull
	private LocalDate dataHoraCadastro;

	public Cliente(@NotBlank String nome, @NotBlank @Email String email, @NotBlank String senha,
			@NotNull LocalDate dataHoraCadastro) {
		this.nome = nome;
		this.email = email;
		this.dataHoraCadastro = LocalDate.now();
	}
}
