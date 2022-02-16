package characters;

public enum EnemyType {
    GOBLIN(2),
    GIANT_SPIDER(5),
    TROLL(7);
    
    private final int healthPoints;

    EnemyType(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }
}
