package characters;

public class Enemy {
    private EnemyType enemyType;

    public EnemyType getEnemyType() {
        return enemyType;
    }

    public Enemy(EnemyType enemyType) {
        this.enemyType = enemyType;
    }
}
