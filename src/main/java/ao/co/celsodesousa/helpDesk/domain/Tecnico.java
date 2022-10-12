package ao.co.celsodesousa.helpDesk.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@NoArgsConstructor
public class Tecnico extends Pessoa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//@ElementCollection(fetch = FetchType.EAGER)
	@OneToMany(mappedBy = "tecnico",cascade = CascadeType.ALL)
	/*@JoinTable(name="chamado",joinColumns = {@JoinColumn(name = "tecnico_id")},
	           inverseJoinColumns = {@JoinColumn(name = "chamado_id")} )*/
	@JsonIgnore
	private List<Chamado> chamado = new ArrayList<>();

	public Tecnico(Integer id, String nome, String cpf, String email, String senha, List<Chamado> chamado) {
		super(id, nome, cpf, email, senha);
		this.chamado = chamado;
	}
	public Tecnico( String nome, String cpf, String email, String senha, List<Chamado> chamado,Set<Integer> perfis) {
		super(nome, cpf, email, senha, perfis);
		this.chamado = chamado;
	}
	public Tecnico( String nome, String cpf, String email, String senha) {
		super(nome, cpf, email, senha);
	
	}
	
	
	
	
	

}
