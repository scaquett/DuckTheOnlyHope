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
                this.getModifiersFromWeightAndHeight(super.getWeight(), super.getHeight()),
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
        //time brings wisdom, but it also brings back pain
        if (age >= 0 && age <= 3) {
            return new ModifiersDTO(3, 7, 3);
        } else if (age >= 4 && age <= 12) {
            return new ModifiersDTO(10, 15, 8);
        } else if (age >= 13 && age <= 17) {
            return new ModifiersDTO(15, 16, 11);
        } else if (age >= 18 && age <= 30) {
            return new ModifiersDTO(20, 15, 13);
        } else if (age >= 31 && age <= 45) {
            return new ModifiersDTO(19, 13, 15);
        } else if (age >= 46 && age <= 65) {
            return new ModifiersDTO(17, 11, 16);
        } else if (age >= 66) {
            return new ModifiersDTO(10, 6, 14);
        } else {
            throw new IllegalArgumentException(age + " is not a valid value for age");
        }
    }

    private ModifiersDTO getModifiersFromWeightAndHeight(Float weight, Float height) {
        Float bmi = weight / (height * 2);
        //weigth and height do not affect intelligence
        if (bmi < 18.5) {
            return new ModifiersDTO(6, 14, 0);
        } else if (bmi > 18.5 && bmi < 24.9) {
            return new ModifiersDTO(16, 20, 0);
        } else if (bmi > 25.0 && bmi < 29.9) {
            return new ModifiersDTO(16, 16, 0);
        } else if (bmi > 30.0 && bmi < 34.9) {
            return new ModifiersDTO(15, 14, 0);
        } else if (bmi > 35.0 && bmi < 39.9) {
            return new ModifiersDTO(15, 11, 0);
        } else if (bmi >= 40) {
            return new ModifiersDTO(13, 9, 0);
        } else {
            if (weight < 0) {
                throw new IllegalArgumentException(weight + " is not a valid value for weight");
            } else {
                throw new IllegalArgumentException(height + " is not a valid value for height");
            }
        }
    }

}
