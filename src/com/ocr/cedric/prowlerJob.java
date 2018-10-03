package com.ocr.cedric;

public class prowlerJob extends Jobs {

    public prowlerJob(int level, int strength, int dexterity, int intellect) {
        this.level = level;
        this.lifePoints = level * 5;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intellect = intellect;

        System.out.println("Félicitation, votre Rôdeur est prêt à combattre !");
    }

    public int basicAttack() {
        System.out.println("Vous utilisez TIR A L'ARC et infligez " + this.dexterity);
        return this.dexterity;
    }

    public int specialAttack() {
        System.out.println("Vous utilisez CONCENTRATION et gagnez " + (this.dexterity)/2 + " en dextérité");
        this.setNewDexterity(this.dexterity + (this.dexterity)/2);
        return 0;
    }

}
