package players;

public class Warlock extends Spellcaster{
    public Warlock(String name, int healthPoints, int treasurePoints) {
        super(name, healthPoints, treasurePoints);
    }

    @Override
    SpellType setStartingSpell() {
        return SpellType.FIREBALL;
    }

    @Override
    CreatureType setStartingCreature() {
        return CreatureType.DRAGON;
    }
}
