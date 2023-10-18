package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ModifiersDTO;

/**
 *
 * @author Willian Scaquett
 */
public enum Game {

    //the more difficult, faster and creative the game, the more intelligence
    COUNTER_STRIKE("Counter Strike", 0, 0, 12),
    MINECRAFT("Minecraft", 0, 0, 14),
    FORTNITE("Fortnite", 0, 0, 10),
    THE_WITCHER("The Witcher", 0, 0, 10),
    VALORANT("Valorant", 0, 0, 8),
    ASSASSINS_CREED("Assassin's Creed", 0, 0, 10),
    WORLD_OF_WARCRAFT("World of Warcraft", 0, 0, 16),
    FIFA("FIFA", 0, 0, 8),
    LEAGUE_OF_LEGENDS("League of Legends", 0, 0, 15),
    DOTA("Dota", 0, 0, 16),
    ROCKET_LEAGUE("Rocket League", 0, 0, 10),
    OUTRO("Outro - pouco relevante", 0, 0, 12);

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
