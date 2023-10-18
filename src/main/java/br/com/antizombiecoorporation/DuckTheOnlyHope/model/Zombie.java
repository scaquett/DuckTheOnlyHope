package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ModifiersDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import java.util.Arrays;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Willian Scaquett
 */
@Getter
@Setter
@NoArgsConstructor
@Entity(name = "zombie")
public class Zombie extends Host {

    @Column(name = "strength")
    private Integer strength = 0;

    @Column(name = "speed")
    private Integer speed = 0;

    @Column(name = "intelligence")
    private Integer intelligence = 0;

    public Zombie(Integer age, Sex sex, Float weight, Float height, BloodType bloodType, MusicalGenre musicalGenre, Sport sport, Game game) {
        super(age, sex, weight, height, bloodType, musicalGenre, sport, game);
        this.setAttributes();
    }

    private void setAttributes() {
        for (ModifiersDTO modifiersDTO : Arrays.asList(
                this.getModifiersFromAge(super.getAge()),
                super.getSex().getModifiersDTO(),
                this.getModifiersFromWeight(super.getWeight()),
                this.getModifiersFromHeight(super.getHeight()),
                super.getBloodType().getModifiersDTO(),
                super.getMusicalGenre().getModifiersDTO(),
                super.getSport().getModifiersDTO(),
                super.getGame().getModifiersDTO())) {
            this.strength += modifiersDTO.getStrength();
            this.speed += modifiersDTO.getSpeed();
            this.intelligence += modifiersDTO.getIntelligence();
        }
    }

    private ModifiersDTO getModifiersFromAge(Integer age) {
        if (age >= 0 && age <= 3) {
            return new ModifiersDTO(2, 5, 2);
        } else if (age >= 4 && age <= 12) {
            return new ModifiersDTO(5, 11, 6);
        } else if (age >= 13 && age <= 17) {
            return new ModifiersDTO(9, 12, 8);
        } else if (age >= 18 && age <= 30) {
            return new ModifiersDTO(12, 10, 10);
        } else if (age >= 31 && age <= 45) {
            return new ModifiersDTO(11, 9, 11);
        } else if (age >= 46 && age <= 65) {
            return new ModifiersDTO(10, 8, 12);
        } else if (age >= 66) {
            return new ModifiersDTO(8, 5, 11);
        } else {
            throw new IllegalArgumentException(age + " is not a valid value for age");
        }
    }

    private ModifiersDTO getModifiersFromWeight(Float weight) {
        //weigth does not affect intelligence
        if (weight >= 1 && weight <= 40) {
            return new ModifiersDTO(3, 5, 0);
        } else if (weight >= 41 && weight <= 60) {
            return new ModifiersDTO(6, 10, 0);
        } else if (weight >= 61 && weight <= 80) {
            return new ModifiersDTO(9, 12, 0);
        } else if (weight >= 81 && weight <= 100) {
            return new ModifiersDTO(11, 9, 0);
        } else if (weight >= 101) {
            return new ModifiersDTO(12, 7, 0);
        } else {
            throw new IllegalArgumentException(weight + " is not a valid value for weight");
        }
    }

    private ModifiersDTO getModifiersFromHeight(Float height) {
        //heigth does not affect intelligence
        if (height >= 0.01 && height <= 1) {
            return new ModifiersDTO(3, 5, 0);
        } else if (height >= 1.01 && height <= 1.4) {
            return new ModifiersDTO(6, 10, 0);
        } else if (height >= 1.41 && height <= 1.6) {
            return new ModifiersDTO(9, 12, 0);
        } else if (height >= 1.61 && height <= 1.8) {
            return new ModifiersDTO(11, 9, 0);
        } else if (height >= 1.81 && height <= 2) {
            return new ModifiersDTO(11, 9, 0);
        } else if (height >= 2.01) {
            return new ModifiersDTO(12, 7, 0);
        } else {
            throw new IllegalArgumentException(height + " is not a valid value for height");
        }
    }

}
