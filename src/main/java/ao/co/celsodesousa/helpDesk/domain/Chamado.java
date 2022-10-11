package ao.co.celsodesousa.helpDesk.domain;

import java.time.LocalDate;
import java.util.Objects;

import ao.co.celsodesousa.helpDesk.domain.enums.Prioridade;
import ao.co.celsodesousa.helpDesk.domain.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chamado {
	
	private Integer id;
	private LocalDate dataAbertura = LocalDate.now();
	private LocalDate dataFechamento;
	private Prioridade prioridade;
	private String titulo;
	private String observacao;
	private Status status;
	
	private Tecnico tecnico;
	private Cliente cliente;
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chamado other = (Chamado) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	
	
	
	
	
	

}
