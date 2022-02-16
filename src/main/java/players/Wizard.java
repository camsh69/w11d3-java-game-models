package players;

public class Wizard extends Spellcaster{
    public Wizard(String name, int healthPoints, int treasurePoints) {
        super(name, healthPoints, treasurePoints);
    }

    @Override
    SpellType setStartingSpell() {
        return SpellType.LIGHTNING;
    }

    @Override
    CreatureType setStartingCreature() {
        return CreatureType.GOLEM;
    }
}
