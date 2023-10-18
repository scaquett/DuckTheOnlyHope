package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ModifiersDTO;
import lombok.AllArgsConstructor;

/**
 *
 * @author Willian Scaquett
 */
@AllArgsConstructor
public enum Sport {

    //values ​​based on skills required in each sports
    FUTEBOL("Futebol", 12, 20, 9),
    BASQUETE("Basquete", 13, 20, 8),
    VOLEI("Vôlei", 10, 10, 14),
    LUTA("Luta", 16, 12, 12),
    ATLETISMO("Atletismo", 14, 18, 7),
    ESPORTS("eSports", 0, 0, 16),
    NADA("Nada", 0, 0, 0);

    private final String name;
    private final ModifiersDTO modifiersDTO;

    private Sport(String name, int strength, int speed, int intelligence) {
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
