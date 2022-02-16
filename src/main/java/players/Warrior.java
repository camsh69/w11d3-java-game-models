package players;

import java.util.ArrayList;

public abstract class Warrior extends Player {
    private ArrayList<WeaponType> weapons;
    private WeaponType weapon;

    public Warrior(String name, int healthPoints, int treasurePoints) {
        super(name, healthPoints, treasurePoints);
        this.weapons = new ArrayList<>();
        this.weapon = setStartingWeapon();
    }

    abstract WeaponType setStartingWeapon();

    public ArrayList<WeaponType> getWeapons() {
        return weapons;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void addWeapon(WeaponType weapon) {
        if (!weapons.contains(weapon)) {
            this.weapons.add(weapon);
        }
    }

    public void chooseWeapon(WeaponType weapon) {
        if (getWeapons().contains(weapon)) {
            this.weapon = weapon;
        }
    }
}
