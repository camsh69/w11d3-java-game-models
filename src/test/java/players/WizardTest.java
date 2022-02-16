package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class WizardTest {
    Wizard wizard;

    @Before
    public void before() {
        wizard = new Wizard("Merlin", 8, 10);
    }

    @Test
    public void hasSpells() {
        assertNotNull(wizard.getSpells());
        assertFalse(wizard.getSpells().isEmpty());
    }

    @Test
    public void hasCreatures() {
        assertNotNull(wizard.getCreatures());
        assertFalse(wizard.getCreatures().isEmpty());
    }

    @Test
    public void canAddSpell() {
        wizard.addSpell(SpellType.CYCLONE);
        assertEquals(2, wizard.getSpells().size());
        assertTrue(wizard.getSpells().contains(SpellType.CYCLONE));
    }

    @Test
    public void canAddCreature() {
        wizard.addCreature(CreatureType.IMP);
        assertEquals(2, wizard.getCreatures().size());
        assertTrue(wizard.getCreatures().contains(CreatureType.IMP));
    }
}
