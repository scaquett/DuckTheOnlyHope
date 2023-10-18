package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

import lombok.AllArgsConstructor;

/**
 *
 * @author Willian Scaquett
 */
@AllArgsConstructor
public enum Sport {

    FUTEBOL("Futebol"),
    BASQUETE("Basquete"),
    VOLEI("Vôlei"),
    LUTA("Luta"),
    ATLETISMO("Atletismo"),
    ESPORTS("eSports"),
    NADA("Nada");

    public String name;

}
