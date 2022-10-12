package ao.co.celsodesousa.helpDesk.domain.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;



import com.fasterxml.jackson.annotation.JsonFormat;

import ao.co.celsodesousa.helpDesk.domain.enums.Perfil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TecnicoDTO {

	protected Integer id;

	protected String nome;

	protected String cpf;

	protected String email;

	protected String senha;

	protected Set<Perfil> perfils = new HashSet<Perfil>();

	@JsonFormat(pattern = "dd/MM/yyyy")
	protected LocalDate dataCriacao = LocalDate.now();
	
	
	

}
