package br.com.antizombiecoorporation.DuckTheOnlyHope.dto;

import br.com.antizombiecoorporation.DuckTheOnlyHope.model.BloodType;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Game;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.MusicalGenre;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Sex;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Sport;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Willian Scaquett
 */
@Data
@AllArgsConstructor
public class ZombieDTO {

    int age;
    Sex sex;
    float weight;
    float height;
    BloodType bloodType;
    MusicalGenre musicalGenre;
    Sport sport;
    Game game;

}
