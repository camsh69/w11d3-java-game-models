package characters;

public class Enemy {
    private EnemyType enemyType;

    public Enemy(EnemyType enemyType) {
        this.enemyType = enemyType;
    }

    public EnemyType getEnemyType() {
        return this.enemyType;
    }
}
