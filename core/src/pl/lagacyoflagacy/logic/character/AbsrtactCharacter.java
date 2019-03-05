package pl.lagacyoflagacy.logic.character;

import pl.lagacyoflagacy.logic.entity.Container;

public abstract class AbsrtactCharacter {

    protected String name = "Character";
    protected int strength = 1;
    protected int dexterity = 1;
    protected int endurance = 1;
    protected int perceptivity = 1;
    protected int wisdom = 1;



    protected Container inventory = new Container();

    public void attack(AbsrtactCharacter character) {

    }

    public void move() {

    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getPerceptivity() {
        return perceptivity;
    }

    public void setPerceptivity(int perceptivity) {
        this.perceptivity = perceptivity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public Container getInventory() {
        return inventory;
    }

    public void setInventory(Container inventory) {
        this.inventory = inventory;
    }
}
