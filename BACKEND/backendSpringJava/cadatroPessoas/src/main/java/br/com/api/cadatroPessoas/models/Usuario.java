package br.com.api.cadatroPessoas.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = Usuario.TABLE_NAME)
public class Usuario {
	public static final String TABLE_NAME = "usuario";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario", nullable = false, unique = true)
	private Long idUsuario;
	
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@Column(name = "senha", nullable = false, length = 255)
	private String senha;
	
	@ManyToOne
	@JoinColumn(name="idParceiroNegocioFK", nullable=false)
	private ParceiroNegocio idParceiroNegocioFK;
	
	
}
	
