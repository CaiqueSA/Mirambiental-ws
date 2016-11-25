package br.com.unip.mirambientalws.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.unip.mirambientalws.modelo.Usuario;

@Repository
public interface MirambientaUsuariolRepository extends CrudRepository<Usuario, Integer> {

	List<Usuario> findBynomeUsuario(String nomeUsuario);

}
