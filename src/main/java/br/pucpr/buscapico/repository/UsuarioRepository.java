package br.pucpr.buscapico.repository;

import org.springframework.data.repository.CrudRepository;

import br.pucpr.buscapico.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
