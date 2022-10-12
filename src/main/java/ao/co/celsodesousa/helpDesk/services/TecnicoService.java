package ao.co.celsodesousa.helpDesk.services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ao.co.celsodesousa.helpDesk.domain.Tecnico;
import ao.co.celsodesousa.helpDesk.exceptions.ObjectNotFoundException;
import ao.co.celsodesousa.helpDesk.repository.TecnicoRepository;

@Service
public class TecnicoService implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	
	@Autowired
	private TecnicoRepository repository;
	
	
	public Tecnico findById(Integer id)
	{
		
		Optional<Tecnico> optional =  repository.findById(id);
		
		return  optional.orElseThrow(  () -> new ObjectNotFoundException("Nao foi econtrado nenhum tecnico com esse id ="+id));
		
		 
		
		
		
	}


	public List<Tecnico> findAll() {
		
		return this.repository.findAll();
	}
}
