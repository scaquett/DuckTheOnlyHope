package br.com.antizombiecoorporation.DuckTheOnlyHope.business;

import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.InfoToDuckDTO;
import br.com.antizombiecoorporation.DuckTheOnlyHope.dto.ZombieDTO;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Armor;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.CombatMode;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Risk;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Weapon;
import br.com.antizombiecoorporation.DuckTheOnlyHope.model.Zombie;
import br.com.antizombiecoorporation.DuckTheOnlyHope.repository.ZombieRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Willian Scaquett
 */
@Service
public class ZombieBO {

    @Autowired
    ZombieRepository zombieRepository;

    public List<ZombieDTO> getAll() {
        return zombieRepository.getAll();
    }

    public InfoToDuckDTO getCombatStrategy(Long zombieId) {
        Optional<Zombie> optionalZombie = zombieRepository.findById(zombieId);

        if (optionalZombie.isPresent()) {
            Zombie zombie = optionalZombie.get();
            return new InfoToDuckDTO(
                    chooseArmor(zombie),
                    chooseWeapon(zombie),
                    chooseCombatMode(zombie),
                    getRisk(zombie),
                    new ZombieDTO(
                            zombie.getId(),
                            zombie.getAge(),
                            zombie.getSex(),
                            zombie.getWeight(),
                            zombie.getHeight(),
                            zombie.getBloodType(),
                            zombie.getMusicalGenre(),
                            zombie.getSport(),
                            zombie.getGame(),
                            zombie.getStrength(),
                            zombie.getSpeed(),
                            zombie.getIntelligence()
                    )
            );
        } else {
            throw new IllegalArgumentException("No zombie found with id " + zombieId);
        }
    }

    private Armor chooseArmor(Zombie zombie) {
        if (zombie.getStrength() > 75) {
            return Armor.HEAVY; //you need to tank
        } else if (zombie.getSpeed() > 75) {
            return Armor.MEDIUM; //you need mobility, but a sneak attack can hurt
        } else if (zombie.getSpeed() > 75) {
            return Armor.LIGHT; //be faster than it thinking
        }
        return Armor.DEFAULT; //default protection is enough
    }

    private Weapon chooseWeapon(Zombie zombie) {
        int strength = zombie.getStrength();
        int speed = zombie.getSpeed();
        int intelligence = zombie.getIntelligence();

        if (strength < 50) {
            return Weapon.BLADE; //its attacks won't hurt you, come close and finish him!
        } else if (speed < 50) {
            return Weapon.BOMB; //do like bomberman! It won't escape
        } else if (intelligence < 50) {
            return Weapon.SNIPER; //stay away. Aim well. One shot will be enough
        } else if (strength > 75 && speed > 75 && intelligence > 75) {
            return Weapon.DEPLETED_URANIUM_MUNITION; //you need damage, you need accuracy, you need fast shots and you need lucky
        } else if (strength > 75 && speed > 75) {
            return Weapon.MISSELE; //you need damage, but you also need accuracy
        } else if (strength > 75 && intelligence > 75) {
            return Weapon.MACHINE_GUN; //fast shots and damage is solution
        } else if (speed > 75 && intelligence > 75) {
            return Weapon.LASER; //shoot quickly and repeatedly, be faster thant it and don't let it think
        } else if (strength > 75) {
            return Weapon.BAZOOKA; //damage!
        } else if (speed > 75) {
            return Weapon.RIFLE; //fast shots!
        } else if (intelligence > 75) {
            return Weapon.TASER; //you can't think while a electric discharge!
        }

        return Weapon.PISTOL; //a regular weapon to a regular zombie. Be careful you can!

    }

    private CombatMode chooseCombatMode(Zombie zombie) {
        if (zombie.getStrength() > 75) {
            return CombatMode.AIR; //if zombie is strong, stay away and be careful
        } else if (zombie.getIntelligence() > 75) {
            return CombatMode.WHEREVER_YOU_ARE; //if zombie is smart, attack fast wherever you are and don't let it think
        } else if (zombie.getIntelligence() > 75) {
            return CombatMode.WATER; //if zombie is fast, ducks also are fast... in water
        }
        return CombatMode.GROUND; //eletronics things work better when dry. Fly is tiring and wastes energy. If there is no advantage, keep the combat on the ground 
    }

    private Risk getRisk(Zombie zombie) {
        int risk = (zombie.getStrength() + zombie.getSpeed() + zombie.getIntelligence()) / 3;

        if (risk < 50) {
            return Risk.LOW;
        } else if (risk > 50 && risk < 70) {
            return Risk.MEDIUM;
        } else if (risk > 70 && risk < 80) {
            return Risk.HIGH;
        } else if (risk > 80 && risk < 90) {
            return Risk.HIGHER;
        }

        return Risk.HIGHEST;
    }

}
