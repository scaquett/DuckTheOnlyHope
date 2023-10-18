package br.com.antizombiecoorporation.DuckTheOnlyHope.business;

import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ZombieDTO;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Zombie;
import br.com.antizombiecoorporation.DuckTheOnlyHope.repository.ZombieRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Willian Scaquett
 */
@Service
public class ZombieBO {

    @Autowired
    ZombieRepository zombieRepository;

    public Zombie add(ZombieDTO zombieDTO) {

        Zombie zombie = new Zombie(
                zombieDTO.getAge(),
                zombieDTO.getSex(),
                zombieDTO.getWeight(),
                zombieDTO.getHeight(),
                zombieDTO.getBloodType(),
                zombieDTO.getMusicalGenre(),
                zombieDTO.getSport(),
                zombieDTO.getGame()
        );

        zombieRepository.save(zombie);

        return zombie;

    }

    public List<Zombie> getAll() {
        return zombieRepository.findAll();
    }

}
