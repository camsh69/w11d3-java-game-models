package players;

public enum CreatureType {
    IMP(1),
    DRAGON(2),
    GOLEM(2);

    private final int healthPoints;

    CreatureType(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
