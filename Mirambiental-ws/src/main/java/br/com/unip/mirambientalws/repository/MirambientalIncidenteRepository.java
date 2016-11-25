package br.com.unip.mirambientalws.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.unip.mirambientalws.modelo.Incidente;

@Repository
public interface MirambientalIncidenteRepository extends CrudRepository<Incidente, Integer> {

	List<Incidente> findByidIncidente(Integer idIncidente);
}
