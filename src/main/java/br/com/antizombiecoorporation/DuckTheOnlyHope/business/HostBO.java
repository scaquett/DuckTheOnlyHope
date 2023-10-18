package br.com.antizombiecoorporation.DuckTheOnlyHope.business;

import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.HostDTO;
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
public class HostBO {

    @Autowired
    ZombieRepository zombieRepository;

    public Zombie add(HostDTO hostDTO) {

        //Oh no! The host has turned into a zombie!
        Zombie zombie = new Zombie(
                hostDTO.getAge(),
                hostDTO.getSex(),
                hostDTO.getWeight(),
                hostDTO.getHeight(),
                hostDTO.getBloodType(),
                hostDTO.getMusicalGenre(),
                hostDTO.getSport(),
                hostDTO.getGame()
        );

        zombieRepository.save(zombie);

        return zombie;
    }

}
