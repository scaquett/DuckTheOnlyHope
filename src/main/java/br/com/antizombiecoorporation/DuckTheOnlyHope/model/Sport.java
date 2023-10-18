package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ModifiersDTO;
import lombok.AllArgsConstructor;

/**
 *
 * @author Willian Scaquett
 */
@AllArgsConstructor
public enum Sport {

    FUTEBOL("Futebol", 8, 12, 10),
    BASQUETE("Basquete", 10, 10, 11),
    VOLEI("Vôlei", 8, 10, 12),
    LUTA("Luta", 12, 8, 10),
    ATLETISMO("Atletismo", 10, 12, 8),
    ESPORTS("eSports", 0, 0, 12),
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
