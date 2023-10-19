package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

/**
 *
 * @author Willian Scaquett
 */
public enum Risk {

    LOW("Leve - Apenas mais um dia no apocalipse."),
    MEDIUM("Medio - Imponha-se! Mas respeite seu adversário."),
    HIGH("Alto - Cuidado!"),
    HIGHER("Muito alto - Não econimize nas defesas e no poder de fogo."),
    HIGHEST("Altíssimo - Não vá sozinho! Busque reforços para combatê-lo.");

    private final String name;

    private Risk(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
