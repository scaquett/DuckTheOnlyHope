package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ModifiersDTO;

/**
 *
 * @author Willian Scaquett
 */
public enum MusicalGenre {

    //musicalGenre does not affect strength (but it affects speed, based on the speed of songs in the genre)
    //and intelligence was calculated by the quantity of instruments that songs of the genre usually have (don't ask me why)
    POP("Pop", 0, 16, 12),
    ROCK("Rock", 0, 16, 16),
    PAGODE("Pagode", 0, 9, 14),
    SERTANEJO("Sertanejo", 0, 13, 10),
    HIP_HOP_RAP("Hip-Hop/Rap", 0, 20, 8),
    ELETRONICA("Eletrônica", 0, 11, 6),
    FUNK("Funk", 0, 13, 5),
    METAL("Metal", 0, 20, 16),
    ESQUIZITICE("Demais gêneros estranhos", 0, 2, 16);

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
