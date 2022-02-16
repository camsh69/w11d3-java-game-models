package players;

public abstract class Player {
    private String name;
    private int healthPoints;
    private int treasurePoints;

    public Player(String name, int healthPoints, int treasurePoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.treasurePoints = treasurePoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getTreasurePoints() {
        return treasurePoints;
    }
}

