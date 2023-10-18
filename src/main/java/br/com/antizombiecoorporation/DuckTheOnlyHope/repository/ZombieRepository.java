package br.com.antizombiecoorporation.DuckTheOnlyHope.repository;

import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ZombieDTO;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Zombie;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Willian Scaquett
 */
public interface ZombieRepository extends JpaRepository<Zombie, Long> {

    @Query(value = "select new br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ZombieDTO( "
            + "    z.id, "
            + "    z.age, "
            + "    z.sex, "
            + "    z.weight, "
            + "    z.height, "
            + "    z.bloodType, "
            + "    z.musicalGenre, "
            + "    z.sport, "
            + "    z.game, "
            + "    z.strength, "
            + "    z.speed, "
            + "    z.intelligence "
            + ") "
            + "from zombie z")
    List<ZombieDTO> getAll();

}
