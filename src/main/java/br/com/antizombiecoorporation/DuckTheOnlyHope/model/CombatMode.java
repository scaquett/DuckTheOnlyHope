package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

/**
 *
 * @author Willian Scaquett
 */
public enum CombatMode {

    GROUND("Solo"),
    AIR("Ar"),
    WATER("Água"),
    WHEREVER_YOU_ARE("Onde estiver");

    private final String name;

    private CombatMode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
