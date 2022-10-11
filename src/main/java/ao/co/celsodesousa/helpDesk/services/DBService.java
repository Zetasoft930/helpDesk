package ao.co.celsodesousa.helpDesk.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ao.co.celsodesousa.helpDesk.domain.Chamado;
import ao.co.celsodesousa.helpDesk.domain.Cliente;
import ao.co.celsodesousa.helpDesk.domain.Tecnico;
import ao.co.celsodesousa.helpDesk.domain.enums.Perfil;
import ao.co.celsodesousa.helpDesk.domain.enums.Prioridade;
import ao.co.celsodesousa.helpDesk.repository.ChamadoRepository;
import ao.co.celsodesousa.helpDesk.repository.ClienteRepository;
import ao.co.celsodesousa.helpDesk.repository.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	
	public void instanciaDB() {
		
		
		Tecnico tecnico = new Tecnico("Celso de Sousa", "342233", "celso@gmail.com", "1234");
		tecnico.addPerfil(Perfil.TECNICO);
		
		
		Cliente cliente = new Cliente("Mauro Francisco", "563542342", "mauro@gmail.com", "0000");
		
		Prioridade prioridade = Prioridade.BAIXA;
		
		
		Chamado chamado = new Chamado(prioridade, "Primeiro", "analise de requisitos", tecnico, cliente);
		
		
		tecnicoRepository.save(tecnico);
		clienteRepository.save(cliente);
		chamadoRepository.save(chamado);
		
		
	}

}
