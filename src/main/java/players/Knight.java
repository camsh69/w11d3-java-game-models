package players;

public class Knight extends Warrior{
    public Knight(String name, int healthPoints, int treasurePoints) {
        super(name, healthPoints, treasurePoints);
    }

    @Override
    WeaponType setStartingWeapon() {
        addWeapon(WeaponType.SWORD);
        return WeaponType.SWORD;
    }
}
