package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

/**
 *
 * @author Willian Scaquett
 */
public enum Weapon {

    LASER("Laser"),
    MISSELE("Míssel"),
    MACHINE_GUN("Metralhadora"),
    RIFLE("Rifle"),
    TASER("Taser"),
    PISTOL("Pistola"),
    BLADE("Lâmina"),
    SNIPER("Sniper"),
    BAZOOKA("Bazuca"),
    DEPLETED_URANIUM_MUNITION("Munição de urânio empobrecido"),
    BOMB("Bomba");

    private final String name;

    private Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
