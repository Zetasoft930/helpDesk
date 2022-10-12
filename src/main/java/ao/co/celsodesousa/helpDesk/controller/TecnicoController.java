package ao.co.celsodesousa.helpDesk.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ao.co.celsodesousa.helpDesk.domain.Tecnico;
import ao.co.celsodesousa.helpDesk.services.TecnicoService;

@RestController
@RequestMapping(value="/tecnico")
public class TecnicoController implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Autowired
	private TecnicoService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Tecnico> findById(@PathVariable Integer id)
	{
		
		System.out.println("teste >>> "+id);
		Tecnico modelo = this.service.findById(id);
		
		HttpStatus status = HttpStatus.OK;
		
		if(modelo == null)
		{
			status = HttpStatus.NOT_FOUND;
		}
		
		return new ResponseEntity<Tecnico>(modelo, status);
	}

}
