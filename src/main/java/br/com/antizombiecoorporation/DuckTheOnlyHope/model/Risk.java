package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

/**
 *
 * @author Willian Scaquett
 */
public enum Risk {

    LOW("Baixo"),
    MEDIUM("Medio"),
    HIGH("Alto"),
    HIGHER("Muito alto"),
    HIGHEST("Altíssimo");

    private final String name;

    private Risk(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
