package characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    Enemy enemy;

    @Before
    public void before() {
        enemy = new Enemy(EnemyType.GOBLIN);
    }

    @Test
    public void hasEnemyType() {
        assertEquals(EnemyType.GOBLIN, enemy.getEnemyType());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(2, enemy.getEnemyType().getHealthPoints());
    }
}
