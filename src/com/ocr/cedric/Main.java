package com.ocr.cedric;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenue dans le monde de MagiWorld");

        System.out.println("\nJoueur 1 : créez votre personnage !");
        Jobs player1 = createPlayer();
        System.out.println("\nJoueur 2 : créez votre personnage !");
        Jobs player2 = createPlayer();

        battleToDeath(player1, player2);
    }

    /**
     * This function lunches the script for asking the player character
     */
    public static Jobs createPlayer() {
        Scanner in = new Scanner(System.in);

        System.out.println("Choisissez votre classe : 1=Guerrier, 2=Rôdeur, 3=Mage");
        int playerJobNumber = in.nextInt();
        //System.out.println("VAR playerJobNumber = " + playerJobNumber);

        //Test if the user hasn't choose a valid class
        while(playerJobNumber <1 || playerJobNumber >3 ){
            System.out.println("Ce n'est pas un nombre valide ! Veuillez recommencer");
            playerJobNumber = in.nextInt();
        }
        System.out.println("Niveau de votre personnage ?");
        int playerLevel = in.nextInt();

        System.out.println(">>> RAPPEL : la somme de votre FORCE, DEXTERITE et INTELLIGENCE ne peut pas dépasser votre NIVEAU !");
        System.out.println("Force de votre personnage ?");
        int playerStrength = in.nextInt();
        System.out.println("Dexterité de votre personnage ?");
        int playerDexterity = in.nextInt();
        System.out.println("Intelligence de votre personnage ?");
        int playerIntellect = in.nextInt();
        //Test if the sum is > player's level
        while(playerStrength + playerDexterity + playerIntellect > playerLevel ){
            System.out.println("La somme est supérieure à votre niveau ! Veuillez recommencer");
            System.out.println("Force de votre personnage ?");
            playerStrength = in.nextInt();
            System.out.println("Dexterité de votre personnage ?");
            playerDexterity = in.nextInt();
            System.out.println("Intelligence de votre personnage ?");
            playerIntellect = in.nextInt();
        }

        Jobs newPlayer = null;
        //System.out.println("VAR newPlayer = " + newPlayer);
        switch(playerJobNumber) {
            case 1: newPlayer = new warriorJob(playerLevel, playerStrength,
                    playerDexterity, playerIntellect);
                    //System.out.println("VAR newPlayer1 = " + newPlayer);
                    break;
            case 2: newPlayer = new warriorJob(playerLevel, playerStrength,
                    playerDexterity, playerIntellect);
                    //System.out.println("VAR newPlayer2 = " + newPlayer);
                    break;
            case 3: newPlayer = new wizardJob(playerLevel, playerStrength,
                    playerDexterity, playerIntellect);
                    //System.out.println("VAR newPlayer3 = " + newPlayer);
                    break;
            default: new warriorJob(playerLevel, playerStrength,
                    playerDexterity, playerIntellect);
                    break;
        }

        //System.out.println("VAR newPlayer = " + newPlayer);
        return (newPlayer != null)? newPlayer : createPlayer();
    }

    /**
     *
     * @param player1
     * @param player2
     */
    public static void battleToDeath(Jobs player1, Jobs player2) {
        Scanner in = new Scanner(System.in);
        int nbTurns = 0; //To know which player has to play
        int playerAction = 0;
        int dommages = 0;

        while(player1.lifePoints > 0 && player2.lifePoints > 0) {
            nbTurns++;

            if(nbTurns % 2 == 1) {
                System.out.println("Joueur 1 : A votre tour ! Il vous reste " + player1.lifePoints + "PV. 1=AttaqueBasique 2=AttaqueSpéciale");
                playerAction = in.nextInt();
                while(playerAction < 1 || playerAction >2) {
                    System.out.println("Joueur 1 : Ce n'est pas une action valide. 1=AttaqueBasique 2=AttaqueSpéciale");
                    playerAction = in.nextInt();
                }
                if(playerAction == 1) {
                    dommages = player1.basicAttack();
                    player2.setLifePoints(player2.lifePoints - dommages);

                } else if(playerAction == 2) {
                    dommages = player1.specialAttack();
                    player2.setLifePoints(player2.lifePoints - dommages);
                }

            } else if(nbTurns % 2 == 0) {
                System.out.println("Joueur 2 : A votre tour ! Il vous reste " + player2.lifePoints + "PV. 1=AttaqueBasique 2=AttaqueSpéciale");
                playerAction = in.nextInt();
                while(playerAction < 1 || playerAction >2) {
                    System.out.println("Joueur 1 : Ce n'est pas une action valide. 1=AttaqueBasique 2=AttaqueSpéciale");
                    playerAction = in.nextInt();
                }
                if(playerAction == 1) {
                    dommages = player2.basicAttack();
                    player1.setLifePoints(player2.lifePoints - dommages);

                } else if(playerAction == 2) {
                    dommages = player2.specialAttack();
                    player1.setLifePoints(player2.lifePoints - dommages);
                }
            }

        }
        System.out.println("La partie est finie !");

    }
}