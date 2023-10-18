package br.com.antizombiecoorporation.DuckTheOnlyHope.dto;

import br.com.antizombiecoorporation.DuckTheOnlyHope.model.BloodType;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Game;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.MusicalGenre;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Sex;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Sport;
import lombok.Data;

/**
 *
 * @author Willian Scaquett
 */
@Data
public class ZombieDTO {

    long id;
    int age;
    String sex;
    float weight;
    float height;
    String bloodType;
    String musicalGenre;
    String sport;
    String game;
    int strength;
    int speed;
    int intelligence;

    public ZombieDTO(long id, int age, Sex sex, float weight, float height, BloodType bloodType, MusicalGenre musicalGenre, Sport sport, Game game, int strength, int speed, int intelligence) {
        this.id = id;
        this.age = age;
        this.sex = sex.getName();
        this.weight = weight;
        this.height = height;
        this.bloodType = bloodType.getName();
        this.musicalGenre = musicalGenre.getName();
        this.sport = sport.getName();
        this.game = game.getName();
        this.strength = strength;
        this.speed = speed;
        this.intelligence = intelligence;
    }

}
