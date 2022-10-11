package ao.co.celsodesousa.helpDesk.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import ao.co.celsodesousa.helpDesk.domain.enums.Prioridade;
import ao.co.celsodesousa.helpDesk.domain.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Chamado implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataAbertura = LocalDate.now();
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataFechamento;
	@Enumerated(EnumType.ORDINAL)
	private Prioridade prioridade;
	@Column(nullable = false,length = 255)
	private String titulo;
	@Lob
	@Column(nullable = false)
	private String observacao;
	@Enumerated(EnumType.ORDINAL)
	private Status status;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey)
	private Tecnico tecnico;
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey)
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
