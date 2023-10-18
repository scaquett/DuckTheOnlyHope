package br.com.antizombiecoorporation.DuckTheOnlyHope.repository;

import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Zombie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Willian Scaquett
 */
public interface ZombieRepository extends JpaRepository<Zombie, Long> {

}
