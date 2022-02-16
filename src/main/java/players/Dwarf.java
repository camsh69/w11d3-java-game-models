package players;

import characters.Cleric;

public class Dwarf extends Warrior {
    public Dwarf(String name, int healthPoints, int treasurePoints) {
        super(name, healthPoints, treasurePoints);
    }

    @Override
    WeaponType setStartingWeapon() {
        addWeapon(WeaponType.AXE);
        return WeaponType.AXE;
    }

    public void getHealed(int treasurePoints, Cleric cleric) {
//        this is halfway done
//        cleric.heal(this, treasurePoints);
    }
}
