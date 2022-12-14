package ao.co.celsodesousa.helpDesk.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import ao.co.celsodesousa.helpDesk.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public void instanciaDB() {
		
		this.dbService.instanciaDB();
	}
	

	@Bean
	public ModelMapper modelMapperConfig() {
		return new ModelMapper();
	}


}
