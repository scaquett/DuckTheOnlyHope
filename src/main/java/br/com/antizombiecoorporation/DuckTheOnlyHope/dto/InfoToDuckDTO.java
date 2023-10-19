package br.com.antizombiecoorporation.DuckTheOnlyHope.dto;

import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Armor;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.CombatMode;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Risk;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Weapon;
import lombok.Data;

/**
 *
 * @author Willian Scaquett
 */
@Data
public class InfoToDuckDTO {

    String armor;
    String weapon;
    String combatMode;
    String risk;
    ZombieDTO zombieDTO;

    public InfoToDuckDTO(Armor armor, Weapon weapon, CombatMode combatMode, Risk risk, ZombieDTO zombieDTO) {
        this.armor = armor.getName();
        this.weapon = weapon.getName();
        this.combatMode = combatMode.getName();
        this.risk = risk.getName();
        this.zombieDTO = zombieDTO;
    }
}
