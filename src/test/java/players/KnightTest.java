package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight knight;

    @Before
    public void before() {
        knight = new Knight("Sir Lancelot", 10, 10);
        knight.addWeapon(WeaponType.AXE);
    }

    @Test
    public void hasName() {
        assertEquals("Sir Lancelot", knight.getName());
    }
}
