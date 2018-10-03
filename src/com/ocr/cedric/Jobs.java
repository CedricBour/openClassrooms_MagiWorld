package com.ocr.cedric;

public abstract class Jobs {
    protected int level;
    protected int lifePoints;
    protected int strength;
    protected int dexterity;
    protected int intellect;

    /**
     *
     * @param newLifePoints
     */
    public void setLifePoints(int newLifePoints){
        this.lifePoints = newLifePoints;
    }

    /**
     *
     * @param newDexterity
     */
    public void setNewDexterity(int newDexterity){
        this.dexterity = newDexterity;
    }

    /**
     *
     * @return
     */
    abstract int basicAttack();

    /**
     *
     * @return
     */
    abstract int specialAttack();
}
