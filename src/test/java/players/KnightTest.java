package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {
    Knight knight;

    @Before
    public void before() {
        knight = new Knight("Sir Lancelot", 10, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Sir Lancelot", knight.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(10, knight.getHealthPoints());
    }

    @Test
    public void hasTreasurePoints() {
        assertEquals(10, knight.getTreasurePoints());
    }

    @Test
    public void hasWeapons() {
        assertNotNull(knight.getWeapons());
        assertFalse(knight.getWeapons().isEmpty());
    }

    @Test
    public void canAddWeapon() {
        knight.addWeapon(WeaponType.AXE);
        assertEquals(2, knight.getWeapons().size());
        assertTrue(knight.getWeapons().contains(WeaponType.AXE));
    }

    @Test
    public void canChooseWeapon() {
        WeaponType axe = WeaponType.AXE;
        knight.addWeapon(axe);
        assertEquals(WeaponType.SWORD, knight.getWeapon());
        knight.chooseWeapon(axe);
        assertEquals(axe, knight.getWeapon());
    }
}
