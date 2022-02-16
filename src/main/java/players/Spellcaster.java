package players;

import java.util.ArrayList;

public abstract class Spellcaster extends Player{
    private ArrayList<SpellType> spells;
    private ArrayList<CreatureType> creatures;
    private SpellType spell;
    private CreatureType creature;

    public Spellcaster(String name, int healthPoints, int treasurePoints) {
        super(name, healthPoints, treasurePoints);
        this.spells = new ArrayList<>();
        this.creatures = new ArrayList<>();
        this.spell = setStartingSpell();
        this.creature = setStartingCreature();
    }

    abstract SpellType setStartingSpell();
    abstract CreatureType setStartingCreature();

    public ArrayList<SpellType> getSpells() {
        return spells;
    }

    public ArrayList<CreatureType> getCreatures() {
        return creatures;
    }

    public SpellType getSpell() {
        return spell;
    }

    public CreatureType getCreature() {
        return creature;
    }

    public void addSpell(SpellType spell) {
        if (!spells.contains(spell)) {
            this.spells.add(spell);
        }
    }

    public void addCreature(CreatureType creature) {
        if (!creatures.contains(creature)) {
            this.creatures.add(creature);
        }
    }

    public void chooseSpellAndCreature(CreatureType creature, SpellType spell) {
        if (getCreatures().contains(creature) && getSpells().contains(spell)) {
            this.creature = creature;
            this.spell = spell;
        }
    }
}
