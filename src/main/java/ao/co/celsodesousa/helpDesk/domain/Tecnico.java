package ao.co.celsodesousa.helpDesk.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

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
	
	@ElementCollection(fetch = FetchType.EAGER)
	@OneToMany(mappedBy = "tecnico")
	private List<Chamado> chamados = new ArrayList<>();

	public Tecnico(Integer id, String nome, String cpf, String email, String senha, List<Chamado> chamados) {
		super(id, nome, cpf, email, senha);
		this.chamados = chamados;
	}
	public Tecnico( String nome, String cpf, String email, String senha, List<Chamado> chamados,Set<Integer> perfis) {
		super(nome, cpf, email, senha, perfis);
		this.chamados = chamados;
	}
	
	
	
	
	

}
