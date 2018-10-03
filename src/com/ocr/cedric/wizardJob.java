package com.ocr.cedric;

public class wizardJob extends Jobs {

    public wizardJob(int level, int strength, int dexterity, int intellect) {
        this.level = level;
        this.lifePoints = level * 5;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intellect = intellect;

        System.out.println("Félicitation, votre Magicien est prêt à combattre !");
    }

    /**
     *
     * @return
     */
    public int basicAttack() {
        System.out.println("Vous utilisez BOULE DE FEU et infligez " + this.intellect);
        return this.intellect;
    }

    /**
     *
     * @return
     */
    public int specialAttack() {
        System.out.println("Vous utilisez SOIN et vous vous soignez de " + (this.intellect)*2);
        this.setLifePoints(this.lifePoints + (this.intellect)*2);
        return 0;
    }

}
