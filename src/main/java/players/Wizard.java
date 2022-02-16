package players;

public class Wizard extends Spellcaster{
    public Wizard(String name, int healthPoints, int treasurePoints) {
        super(name, healthPoints, treasurePoints);
    }

    @Override
    SpellType setStartingSpell() {
        addSpell(SpellType.LIGHTNING);
        return SpellType.LIGHTNING;
    }

    @Override
    CreatureType setStartingCreature() {
        addCreature(CreatureType.GOLEM);
        return CreatureType.GOLEM;
    }
}
