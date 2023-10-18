package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ModifiersDTO;
import br.com.antizombiecoorporation.DuckTheOnlyHope.util.MathUtil;

/**
 *
 * @author Willian Scaquett
 */
public enum BloodType {
    A_POSITIVE("A+"),
    A_NEGATIVE("A-"),
    B_POSITIVE("B+"),
    B_NEGATIVE("B-"),
    O_POSITIVE("O+"),
    O_NEGATIVE("O-"),
    AB_POSITIVE("AB+"),
    AB_NEGATIVE("AB-");

    public String name;
    public ModifiersDTO modifiersDTO;

    private BloodType(String name) {
        this.name = name;
        //unexpected values, like genetics does
        this.modifiersDTO = new ModifiersDTO(
                MathUtil.getRandomModifier(20, this.name.hashCode()),
                MathUtil.getRandomModifier(20, this.name.hashCode()),
                MathUtil.getRandomModifier(20, this.name.hashCode())
        );
    }

    public String getName() {
        return name;
    }

    public ModifiersDTO getModifiersDTO() {
        return modifiersDTO;
    }

}
