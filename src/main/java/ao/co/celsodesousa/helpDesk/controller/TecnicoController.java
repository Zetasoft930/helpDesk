package ao.co.celsodesousa.helpDesk.controller;

import java.io.Serializable;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ao.co.celsodesousa.helpDesk.domain.Tecnico;
import ao.co.celsodesousa.helpDesk.domain.dto.TecnicoDTO;
import ao.co.celsodesousa.helpDesk.services.TecnicoService;

import org.modelmapper.TypeToken;
import java.lang.reflect.Type;

@RestController
@RequestMapping(value="/tecnico")
public class TecnicoController implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Autowired
	private TecnicoService service;
	@Autowired
	private ModelMapper modelMapper ;
	
	@GetMapping
	public ResponseEntity<List<TecnicoDTO>> findAll(){
		
		List<Tecnico> list = this.service.findAll(); 
		Type listType = new TypeToken<List<TecnicoDTO>>(){}.getType();
		List<TecnicoDTO> listDTO = modelMapper.map(list,listType);
		
		return ResponseEntity.ok(listDTO);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<TecnicoDTO> findById(@PathVariable Integer id)
	{
		
		
		Tecnico modelo = this.service.findById(id);
		
		TecnicoDTO dto = modelMapper.map(modelo,TecnicoDTO.class);
		
		HttpStatus status = HttpStatus.OK;
		
		if(modelo == null)
		{
			status = HttpStatus.NOT_FOUND;
		}
		
		return new ResponseEntity<TecnicoDTO>(dto, status);
	}

}
