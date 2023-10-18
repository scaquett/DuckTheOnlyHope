package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ModifiersDTO;

/**
 *
 * @author Willian Scaquett
 */
public enum MusicalGenre {

    POP("Pop", 5, 12, 9),
    ROCK("Rock", 6, 10, 10),
    PAGODE("Pagode", 7, 5, 9),
    SERTANEJO("Sertanejo", 8, 6, 9),
    HIP_HOP_RAP("Hip-Hop/Rap", 9, 10, 10),
    ELETRONICA("Eletrônica", 4, 9, 8),
    FUNK("Funk", 11, 9, 8),
    METAL("Metal", 10, 8, 9),
    ESQUIZITICE("Demais gêneros estranhos", 5, 2, 12);

    private final String name;
    private final ModifiersDTO modifiersDTO;

    private MusicalGenre(String name, int strength, int speed, int intelligence) {
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
