package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

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

}
