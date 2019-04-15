package br.com.comercial.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.comercial.api.model.Oportunidade;

public interface OportunidadeRepository extends JpaRepository<Oportunidade, Long> {
	
	Optional<Oportunidade> findByDescricaoAndNomeProspecto(String descricao, String nomeProspecto);

}
