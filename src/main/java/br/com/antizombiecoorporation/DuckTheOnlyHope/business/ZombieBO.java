package br.com.antizombiecoorporation.DuckTheOnlyHope.business;

import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ZombieDTO;
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

    public List<ZombieDTO> getAll() {
        return zombieRepository.getAll();
    }

}
