package ao.co.celsodesousa.helpDesk.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;



@Data
@EqualsAndHashCode(callSuper=true)
@Builder
public class Cliente extends Pessoa {
	
	
	private List<Chamado> chamados = new ArrayList<>();

}
