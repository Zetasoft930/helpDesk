package ao.co.celsodesousa.helpDesk.services;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ao.co.celsodesousa.helpDesk.domain.Tecnico;
import ao.co.celsodesousa.helpDesk.repository.TecnicoRepository;

@Service
public class TecnicoService implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private TecnicoRepository repository;
	
	
	public Tecnico findById(Integer id)
	{
		
		Optional<Tecnico> optional =  repository.findById(id);
		
		return optional.orElse(null);
		
		
		
	}
}
