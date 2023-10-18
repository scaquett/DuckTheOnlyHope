package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

import lombok.AllArgsConstructor;

/**
 *
 * @author Willian Scaquett
 */
@AllArgsConstructor
public enum MusicalGenre {

    POP("Pop"),
    ROCK("Rock"),
    PAGODE("Pagode"),
    SERTANEJO("Sertanejo"),
    HIP_HOP_RAP("Hip-Hop/Rap"),
    ELETRONICA("Eletrônica"),
    FUNK("Funk"),
    METAL("Metal"),
    ESQUIZITICE("Demais gêneros estranhos");

    public String name;

}
