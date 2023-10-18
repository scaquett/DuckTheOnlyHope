package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

import lombok.AllArgsConstructor;

/**
 *
 * @author Willian Scaquett
 */
@AllArgsConstructor
public enum Game {

    COUNTER_STRIKE("Counter Strike"),
    MINECRAFT("Minecraft"),
    FORTNITE("Fortnite"),
    THE_WITCHER("The Witcher"),
    VALORANT("Valorant"),
    ASSASSINS_CREED("Assassin's Creed"),
    WORLD_OF_WARCRAFT("World of Warcraft"),
    FIFA("FIFA"),
    LEAGUE_OF_LEGENDS("League of Legends"),
    DOTA("Dota"),
    ROCKET_LEAGUE("Rocket League"),
    OUTRO("Outro - pouco relevante");

    public String name;
}
