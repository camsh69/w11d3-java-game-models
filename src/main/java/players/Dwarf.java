package players;

public class Dwarf extends Warrior {
    public Dwarf(String name, int healthPoints, int treasurePoints) {
        super(name, healthPoints, treasurePoints);
    }

    @Override
    WeaponType setStartingWeapon() {
        addWeapon(WeaponType.AXE);
        return WeaponType.AXE;
    }
}
