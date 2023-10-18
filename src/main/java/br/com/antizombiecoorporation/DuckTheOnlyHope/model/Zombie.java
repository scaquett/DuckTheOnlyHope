package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Willian Scaquett
 */
@Data
@NoArgsConstructor
@Entity(name = "zombie")
public class Zombie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "age")
    private Integer age;

    @Column(name = "sex")
    private Sex sex;

    @Column(name = "weight")
    private Float weight;

    @Column(name = "height")
    private Float height;

    @Column(name = "bloodType")
    private BloodType bloodType;

    @Column(name = "musicalGenre")
    private MusicalGenre musicalGenre;

    @Column(name = "sport")
    private Sport sport;

    @Column(name = "game")
    private Game game;

    public Zombie(Integer age, Sex sex, Float weight, Float height, BloodType bloodType, MusicalGenre musicalGenre, Sport sport, Game game) {
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.bloodType = bloodType;
        this.musicalGenre = musicalGenre;
        this.sport = sport;
        this.game = game;
    }

    public Integer getStrength() {
        return 0;
    }

    public Integer getSpeed() {
        return 0;
    }

    public Integer getIntelligence() {
        return 0;
    }

}
