package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ModifiersDTO;

/**
 *
 * @author Willian Scaquett
 */
public enum Game {

    COUNTER_STRIKE("Counter Strike", 5, 8, 10),
    MINECRAFT("Minecraft", 6, 10, 12),
    FORTNITE("Fortnite", 4, 10, 10),
    THE_WITCHER("The Witcher", 10, 7, 12),
    VALORANT("Valorant", 8, 8, 8),
    ASSASSINS_CREED("Assassin's Creed", 9, 12, 9),
    WORLD_OF_WARCRAFT("World of Warcraft", 11, 8, 12),
    FIFA("FIFA", 10, 12, 5),
    LEAGUE_OF_LEGENDS("League of Legends", 2, 10, 11),
    DOTA("Dota", 4, 9, 12),
    ROCKET_LEAGUE("Rocket League", 5, 8, 8),
    OUTRO("Outro - pouco relevante", 2, 8, 12);

    private final String name;
    private final ModifiersDTO modifiersDTO;

    private Game(String name, int strength, int speed, int intelligence) {
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
