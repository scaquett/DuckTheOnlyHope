package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ModifiersDTO;

/**
 *
 * @author Willian Scaquett
 */
public enum Sex {

    //thanks to testosterone, masculine people are stronger. But thanks to Hecate's magic, feminine people are more intelligent (be careful!)
    MALE("Masculino", 16, 0, 11),
    FEMALE("Feminino", 11, 0, 16),
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
