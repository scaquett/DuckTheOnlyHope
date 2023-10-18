package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ModifiersDTO;

/**
 *
 * @author Willian Scaquett
 */
public enum Sex {
    MALE("Masculino", 12, 10, 8),
    FEMALE("Feminino", 8, 10, 12),
    UNKNOWN("Não informado", 0, 0, 0);

    private final String name;
    private final ModifiersDTO modifiersDTO;

    private Sex(String name, int strength, int speed, int intelligence) {
        this.name = name;
        this.modifiersDTO = new ModifiersDTO(strength, speed, intelligence);
    }

    public String getName() {
        return name;
    }

    public ModifiersDTO getModifiersDTO() {
        return modifiersDTO;
    }

}
