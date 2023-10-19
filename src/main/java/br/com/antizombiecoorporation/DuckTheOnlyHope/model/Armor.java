package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

/**
 *
 * @author Willian Scaquett
 */
public enum Armor {

    LIGHT("Leve"),
    MEDIUM("Media"),
    HEAVY("Pesada"),
    DEFAULT("Padrão");

    private final String name;

    private Armor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
