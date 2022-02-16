package players;

public class Barbarian extends Warrior {
    public Barbarian(String name, int healthPoints, int treasurePoints) {
        super(name, healthPoints, treasurePoints);
    }

    @Override
    WeaponType setStartingWeapon() {
        addWeapon(WeaponType.WARHAMMER);
        return WeaponType.WARHAMMER;
    }
}
