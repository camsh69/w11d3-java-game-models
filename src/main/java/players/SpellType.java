package players;

public enum SpellType {
    FIREBALL(3),
    LIGHTNING(3),
    CYCLONE(4);

    private final int healthPoints;

    SpellType(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
