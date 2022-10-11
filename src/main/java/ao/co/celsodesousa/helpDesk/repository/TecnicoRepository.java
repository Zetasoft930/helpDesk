package ao.co.celsodesousa.helpDesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ao.co.celsodesousa.helpDesk.domain.Tecnico;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
