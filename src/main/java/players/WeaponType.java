package players;

public enum WeaponType {
    SWORD(2),
    AXE(2),
    WARHAMMER(3);

    private final int healthPoints;

    WeaponType(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
