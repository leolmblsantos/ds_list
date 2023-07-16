package br.com.projetoautomacao.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoautomacao.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
