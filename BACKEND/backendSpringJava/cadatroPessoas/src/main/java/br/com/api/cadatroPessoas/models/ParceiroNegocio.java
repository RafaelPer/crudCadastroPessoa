package br.com.api.cadatroPessoas.models;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = ParceiroNegocio.TABLE_NAME)
public class ParceiroNegocio {
	public static final String TABLE_NAME = "parceiroNegocio";
	
	
	@OneToMany(mappedBy = "parceiroNegocio")
	private Set<Usuario> usuarios;
	
}
