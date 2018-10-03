package com.ocr.cedric;

/**
 * This abstract class defines the possibles jobs structure
 */
public abstract class Jobs {
    protected int level;
    protected int lifePoints;
    protected int strength;
    protected int dexterity;
    protected int intellect;

    /**
     * This function set the new value of the selected player life points
     * @param newLifePoints the new value to set
     */
    public void setLifePoints(int newLifePoints){
        this.lifePoints = newLifePoints;
    }

    /**
     * This function set the new value of the selected player dexterity
     * @param newDexterity the new value to set
     */
    public void setNewDexterity(int newDexterity){
        this.dexterity = newDexterity;
    }

    /**
     * For each jobs, please define the basic attack
     * @return the number of dommages the player did with this attack
     */
    abstract int basicAttack();

    /**
     * For each jobs, please define the special attack
     * @return the number of dommages the player did with this attack
     */
    abstract int specialAttack();
}
