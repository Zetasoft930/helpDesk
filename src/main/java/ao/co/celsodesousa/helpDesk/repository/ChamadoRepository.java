package ao.co.celsodesousa.helpDesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ao.co.celsodesousa.helpDesk.domain.Chamado;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
