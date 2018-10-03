package com.ocr.cedric;

public class warriorJob extends Jobs {

    public warriorJob(int level, int strength, int dexterity, int intellect) {
        this.level = level;
        this.lifePoints = level * 5;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intellect = intellect;

        System.out.println("Félicitation, votre Guerrier est prêt à combattre !");
    }

    /**
     *
     * @return
     */
    public int basicAttack() {
        System.out.println("Vous utilisez COUP D'EPEE et infligez " + this.strength);
        return this.strength;
    }

    /**
     *
     * @return
     */
    public int specialAttack() {
        System.out.println("Vous utilisez COUP DE RAGE et infligez " + this.strength*2);
        this.setLifePoints(this.lifePoints - this.strength);
        return (this.strength)*2;
    }

}
