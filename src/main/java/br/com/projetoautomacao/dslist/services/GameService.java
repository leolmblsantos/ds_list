package br.com.projetoautomacao.dslist.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.projetoautomacao.dslist.dto.GameMinDTO;
import br.com.projetoautomacao.dslist.entity.Game;
import br.com.projetoautomacao.dslist.repositories.GameRepository;

@Service
public class GameService {
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		//return result.stream().map(GameMinDTO::new).toList();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
